package stn_infotech.stn_chartback.service;

import stn_infotech.stn_chartback.dto.ChartData;

import java.util.List;

public interface ChartService {
    List<ChartData> getDeviceFailureChart(String title,String startDate, String endDate);
    List<ChartData> getFailureChart(String title, String startDate, String endDate );


    List<ChartData> getTrafficChart(String title, String startDate, String endDate);

    List<ChartData> getTrafficStatusChartData(String title, String startDate, String endDate);
}
