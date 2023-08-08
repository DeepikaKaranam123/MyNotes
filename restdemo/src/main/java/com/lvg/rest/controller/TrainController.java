package com.lvg.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lvg.rest.entity.Train;
import com.lvg.rest.service.TrainService;

//@Controller
//@ResponseBody
@RestController
public class TrainController {
@Autowired
TrainService trainService;

@GetMapping("/")
public List<Train> getAllTrains()
{
	return trainService.getAllTrains();
}
@GetMapping("/{trainId}")
public Train getTrainId(@PathVariable int trainId)
{
	return trainService.getTrainByTrainId(trainId);
}


}
