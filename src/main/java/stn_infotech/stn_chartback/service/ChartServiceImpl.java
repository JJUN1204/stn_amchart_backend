package stn_infotech.stn_chartback.service;

import org.springframework.stereotype.Service;
import stn_infotech.stn_chartback.dto.ChartData;
import stn_infotech.stn_chartback.repository.ChartRepository;

import java.util.List;

@Service
public class ChartServiceImpl implements ChartService{
    private final ChartRepository chartRepository;

    public ChartServiceImpl(ChartRepository chartRepository) {
        this.chartRepository = chartRepository;
    }


    @Override
    public List<ChartData> getDeviceFailureChart(String title, String startDate, String endDate) {
        return chartRepository.getDeviceFailureChart(title, startDate,endDate);
    }

    @Override
    public List<ChartData> getFailureChart(String title, String startDate, String endDate) {
        return chartRepository.getFailureChart(title, startDate,endDate);
    }



    @Override
    public List<ChartData> getTrafficChart(String title, String startDate, String endDate) {
        return chartRepository.getTrafficChart(title, startDate,endDate);
    }

    @Override
    public List<ChartData> getTrafficStatusChartData(String title, String startDate, String endDate) {
        return chartRepository.getTrafficStatusChartData(title, startDate, endDate);
    }
}
