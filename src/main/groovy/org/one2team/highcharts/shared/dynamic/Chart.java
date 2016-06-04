package org.one2team.highcharts.shared.dynamic;

import com.google.gwt.shared.Array;
import org.one2team.highcharts.shared.ChartOptions;

public interface Chart {
  
  void _destroy();
  
  ChartOptions getOptions();
  
  Array<Series> getSeries();

}
