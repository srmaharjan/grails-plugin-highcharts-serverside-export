package org.one2team.highcharts.server;

import org.one2team.highcharts.shared.*;
import org.one2team.utils.JSMArray;

import javax.xml.bind.annotation.*;


@XmlRootElement(name = "chartOptions")
@XmlAccessorType(XmlAccessType.NONE)
public class JSMChartOptions extends JSMBaseObject implements ChartOptions {

  public JSMChartOptions () {
  }

  @Override
  public Chart getChart () {
    if (chart == null)
      chart = new JSMChart ();
    return chart;
  }

	@Override
	public Credits getCredits() {
    if (credits == null)
    	credits = new JSMCredits ();
    return credits;
	}

  @Override
  public JSMLabels getLabels () {
    if (labels == null)
      labels = new JSMLabels ();
    return labels;
  }

  @Override
  public Legend getLegend () {
    if (legend == null)
      legend = new JSMLegend ();
    return this.legend;
  }

  @Override
  public PlotOptions getPlotOptions () {
    if (plotOptions == null)
      plotOptions = new JSMPlotOptions ();
    return plotOptions;
  }

  @SuppressWarnings("unchecked")
  @Override
  @XmlTransient
  public JSMArray<Series> getSeries () {
    if (series == null)
      series = new JSMArray<Series> ();
    return (JSMArray<Series>) series;
  }

  @Override
  public Title getTitle () {
    if (title == null)
      title = new JSMTitle ();
    return title;
  }

  @Override
  public Title getSubtitle () {
    if (subtitle == null)
      subtitle = new JSMTitle ();
    return subtitle;
  }

  @Override
  public Tooltip getTooltip () {
    if (tooltip == null)
      tooltip = new JSMTooltip ();
    return tooltip;
  }

  @Override
  public Axis getXAxis () {
    if (xAxis == null)
      xAxis = new JSMAxis ();
    return xAxis;
  }

  @Override
  public Axis getYAxis () {
    if (yAxis == null)
      yAxis = new JSMAxis ();
    return yAxis;
  }

  @XmlTransient
  public Chart chart;

  @XmlElement
  public JSMCredits credits;

  @XmlElement
  public JSMLabels labels;

  @XmlElement
  public JSMLegend legend;

  @XmlElement
  public JSMPlotOptions plotOptions;

//  @XmlTransient
  @XmlElements(@XmlElement(name = "series", type = JSMSeries.class))
  public Object series;

  @XmlElement
  public JSMTitle title;

  @XmlElement
  public JSMTitle subtitle;

  @XmlElement
  public JSMTooltip tooltip;

  @XmlElement
  public JSMAxis xAxis;

  @XmlElement
  public JSMAxis yAxis;

}
