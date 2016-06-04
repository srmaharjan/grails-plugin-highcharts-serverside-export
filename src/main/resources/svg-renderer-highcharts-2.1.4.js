function renderSVG (jsonOptions, jsonGeneralOptions) {
	n = Highcharts.createElement('div', null, null, null, true);

	Highcharts.setOptions (eval (jsonGeneralOptions));
	
	chartOptions = eval (jsonOptions);
	chartOptions.chart.renderTo=n;
	chartOptions.chart.forExport=true;

	chart = new Highcharts.Chart(chartOptions);
	svg = chart.getSVG ();
	chart.destroy ();
	Highcharts.discardElement (n);
	return svg;
}
function renderSVGFromObject (jsonGeneralOptions, chartOptions) {
	n = Highcharts.createElement('div', null, null, null, true);
	var toto = eval (jsonGeneralOptions);
	Highcharts.setOptions.call (Highcharts, toto);
	var newChartOptions = chartOptions;

	new FormatWrapper ().visitObject(newChartOptions);
	var chartOptionsChart = newChartOptions.chart;
	chartOptionsChart.renderTo=n;
	chartOptionsChart.renderer='SVG';

	chart = new Highcharts.Chart(newChartOptions);
	svg = chart.getSVG ();
	chart.destroy ();
	Highcharts.discardElement (n);
	return svg;
}