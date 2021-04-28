package com.a103.apiServer.product.image;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;

@Service
public class ImageServiceImpl implements ImageService {

	private AmazonS3 s3Client;

	@Value("${cloud.aws.credentials.accessKey}")
	private String accessKey;

	@Value("${cloud.aws.credentials.secretKey}")
	private String secretKey;

	@Value("${cloud.aws.s3.bucket}")
	private String bucket;

	@Value("${cloud.aws.region.static}")
	private String region;

	@PostConstruct
	public void setS3Client() throws Exception {
		AWSCredentials credentials = new BasicAWSCredentials(this.accessKey, this.secretKey);

		s3Client = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials))
				.withRegion(this.region).build();

	}

	@Override
	public String upload(MultipartFile file) throws Exception {
		String fileName = file.getOriginalFilename();

		s3Client.putObject(new PutObjectRequest(bucket, fileName, file.getInputStream(), null)
				.withCannedAcl(CannedAccessControlList.PublicRead));
		return s3Client.getUrl(bucket, fileName).toString();
	}
}
