package stn_infotech.stn_chartback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import stn_infotech.stn_chartback.dto.ChartData;
import stn_infotech.stn_chartback.service.ChartService;

import java.util.List;

@CrossOrigin("*")
@RestController
public class ChartController {
    private final ChartService chartService;

    @Autowired
    public ChartController(ChartService chartService) {
        this.chartService = chartService;
    }

    @GetMapping("/getDeviceFailureChart")
    public ResponseEntity<List<ChartData>> getDeviceFailureGrade(String title, String startDate, String endDate){
        return ResponseEntity.ok(chartService.getDeviceFailureChart(title, startDate, endDate));
    }

    @GetMapping("/getFailureChart")
    public ResponseEntity<List<ChartData>> getFailureGrade(String title, String startDate, String endDate ){
        return ResponseEntity.ok(chartService.getFailureChart(title, startDate, endDate));
    }



    @GetMapping("/getTrafficChart")
    public ResponseEntity<List<ChartData>> getTrafficChartGrade(String title, String startDate, String endDate){
        return ResponseEntity.ok(chartService.getTrafficChart(title, startDate, endDate));
    }

    @GetMapping("/getTrafficStatusChart")
    public ResponseEntity<List<ChartData>> getTrafficStatusChartDataGrade(String title, String startDate, String endDate){
        return ResponseEntity.ok(chartService.getTrafficStatusChartData(title, startDate, endDate));
    }




}
