package com.a103.apiServer.review;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.a103.apiServer.model.Review;

@RestController
@RequestMapping("/review")
public class ReviewController {

	@Autowired
	private ReviewDao reviewDao;

	private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);

	@PostMapping(value = "")
	public ResponseEntity createReview(@RequestBody Review review) {
		ResponseEntity entity = null;
		Map result = new HashMap();
		review.setDate(LocalDate.now());

		try {
			reviewDao.save(review);
			result.put("success", "success");
			entity = new ResponseEntity(result, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("error", e);
			result.put("success", "error");
			entity = new ResponseEntity(result, HttpStatus.BAD_REQUEST);
		}

		return entity;
	}

	@GetMapping(value = "/list/{product_id}")
	public ResponseEntity getReviewListByProductId(@PathVariable("product_id") long productId) {
		ResponseEntity entity = null;
		Map result = new HashMap();

		try {
			List<Review> reviewList = reviewDao.findListReviewByProductId(productId);

			if (reviewList.size() != 0) {
				result.put("success", "success");
				result.put("data", reviewList);
				entity = new ResponseEntity(result, HttpStatus.OK);
			} else {
				result.put("success", "fail");
				entity = new ResponseEntity(result, HttpStatus.OK);
			}

		} catch (Exception e) {
			logger.error("error", e);
			result.put("success", "error");
			entity = new ResponseEntity(result, HttpStatus.BAD_REQUEST);
		}

		return entity;
	}

	@GetMapping(value = "/mylist/{member_id}")
	public ResponseEntity getReviewListByMemberId(@PathVariable("member_id") long memberId) {
		ResponseEntity entity = null;
		Map result = new HashMap();

		try {
			List<Review> reviewList = reviewDao.findListReviewByProductId(memberId);

			if (reviewList.size() != 0) {
				result.put("success", "success");
				result.put("data", reviewList);
				entity = new ResponseEntity(result, HttpStatus.OK);
			} else {
				result.put("success", "fail");
				entity = new ResponseEntity(result, HttpStatus.OK);
			}

		} catch (Exception e) {
			logger.error("error", e);
			result.put("success", "error");
			entity = new ResponseEntity(result, HttpStatus.BAD_REQUEST);
		}

		return entity;
	}

	@PutMapping(value = "")
	public ResponseEntity modifyReview(@RequestBody Review review) {
		ResponseEntity entity = null;
		Map result = new HashMap();

		try {
			// 변경 가능한 값 => title, descript, date
			Review modifyReview = reviewDao.getOne(review.getId());
			modifyReview.setTitle(review.getTitle());
			modifyReview.setDescript(review.getDescript());
			modifyReview.setDate(LocalDate.now());
			reviewDao.save(modifyReview);
			result.put("success", "success");
			entity = new ResponseEntity(result, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("error", e);
			result.put("success", "error");
			entity = new ResponseEntity(result, HttpStatus.BAD_REQUEST);
		}

		return entity;
	}

	@DeleteMapping(value = "")
	public ResponseEntity deleteReview(@RequestHeader(value = "id") long reviewId) {
		ResponseEntity entity = null;
		Map result = new HashMap();

		try {
			reviewDao.deleteById(reviewId);
			result.put("success", "success");
			entity = new ResponseEntity(result, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("error", e);
			result.put("success", "error");
			entity = new ResponseEntity(result, HttpStatus.BAD_REQUEST);
		}

		return entity;
	}

}