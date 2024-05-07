package stn_infotech.stn_chartback.repository;

import org.apache.ibatis.annotations.Mapper;
import stn_infotech.stn_chartback.dto.ChartData;

import java.util.List;

@Mapper
public interface ChartRepository {

    List<ChartData> getFailureChart(String title,String startDate, String endDate );

    List<ChartData> getDeviceFailureChart(String title,String startDate, String endDate);

    List<ChartData> getTrafficChart(String title, String startDate, String endDate);

    List<ChartData> getTrafficStatusChartData(String title, String startDate, String endDate);

}
