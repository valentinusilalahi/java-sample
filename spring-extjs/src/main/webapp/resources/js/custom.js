 
//name Space 
Ext.ns('Ext.ux.grid');
Ext.ns('Ext.ux');
 

function formPanel(parameter){


    return new Ext.form.FormPanel({
    	
    	bodyCfg : parameter.bodyCfg || {},  
        fileUpload : parameter.fileUpload || false,
        layout: parameter.layout || 'form',
        buttonAlign : parameter.buttonAlign || 'left',
        labelAlign: parameter.labelAlign || 'left',
        labelWidth: parameter.labelWidth || 200,        
        id: parameter.id || null,
        frame: parameter.frame || true,
        width : parameter.width || '',
        title: parameter.title || null,
        defaults : parameter.defaults || {},
        layoutConfig:parameter.layoutConfig || {},
        submitEmptyText : parameter.submitEmptyText || true,
        reader: new Ext.data.JsonReader({
            root: parameter.reader.root,
            id: parameter.reader.id,
            totalRecords: parameter.reader.totalRecords,
            fields : parameter.reader.fields
        }) || {},
        url: parameter.url,
        items: parameter.items,
        keys : parameter.keys|| {},
        buttons:parameter.buttons
    });
}


function gridPanel(parameterGridPanel){
 
    return new Ext.grid.GridPanel({
        loadMask:true,
        stripeRows: true,
        store: parameterGridPanel.store,
        title :parameterGridPanel.title,
        renderTo:parameterGridPanel.renderTo,
        height : parameterGridPanel.height,
        //autoHeight : true,
        iconCls: parameterGridPanel.iconCls,
        sm: parameterGridPanel.sm,
        colModel : parameterGridPanel.colModel,
        tbar:  parameterGridPanel.tbar,
        bbar: new Ext.PagingToolbar({
            pageSize: parameterGridPanel.bbar.pageSize,
            store: parameterGridPanel.bbar.store,
            displayInfo: parameterGridPanel.bbar.displayInfo,
            displayMsg:  parameterGridPanel.bbar.displayMsg,
            emptyMsg: parameterGridPanel.bbar.emptyMsg
        })

    });
}



function editorGridPanel(parameterGridPanel){

    return new Ext.grid.EditorGridPanel({
        loadMask:true,
        stripeRows: true,
        store: parameterGridPanel.store,
        title :parameterGridPanel.title,
        renderTo:parameterGridPanel.renderTo,
        height : parameterGridPanel.height,
        //autoHeight : true,
        iconCls: parameterGridPanel.iconCls,
        sm: parameterGridPanel.sm,
        colModel : parameterGridPanel.colModel,
        tbar:  parameterGridPanel.tbar,
        bbar: new Ext.PagingToolbar({
            pageSize: parameterGridPanel.bbar.pageSize,
            store: parameterGridPanel.bbar.store,
            displayInfo: parameterGridPanel.bbar.displayInfo,
            displayMsg:  parameterGridPanel.bbar.displayMsg,
            emptyMsg: parameterGridPanel.bbar.emptyMsg
        })

    });
}




function editorSummaryGridPanel(parameterGridPanel){
	var cellTemplate = new Ext.Template( 
                '<div class="x-grid3-summary-row" style="{tstyle}">',
                '<table class="x-grid3-summary-table x-grid3-summary-last-row" border="0" cellspacing="0" cellpadding="0" style="{tstyle}">',
                    '<tbody><tr>{cells}</tr></tbody>',
                '</table></div>'
 				);
		
	var summary = new Ext.ux.grid.HybridSummary({
			rowTpl :cellTemplate
        });



    return new Ext.grid.EditorGridPanel({
        loadMask:true,
        stripeRows: true,
        clicksToEdit: 1,
        collapsible: false,
        animCollapse: false,
        trackMouseOver: true,
        store: parameterGridPanel.store,
        title :parameterGridPanel.title,
        renderTo:parameterGridPanel.renderTo,
        height : parameterGridPanel.height,
        //autoHeight : true,
        iconCls: parameterGridPanel.iconCls,
        sm: parameterGridPanel.sm,
        colModel : parameterGridPanel.colModel,
        tbar:  parameterGridPanel.tbar,
        plugins : summary,
        bbar: new Ext.PagingToolbar({
            pageSize: parameterGridPanel.bbar.pageSize,
            store: parameterGridPanel.bbar.store,
            displayInfo: parameterGridPanel.bbar.displayInfo,
            displayMsg:  parameterGridPanel.bbar.displayMsg,
            emptyMsg: parameterGridPanel.bbar.emptyMsg
        }),
        view: new Ext.grid.GroupingView({
            forceFit: true,
            showGroupName: false,
            enableNoGroups: false,
			enableGroupingMenu: false, 
            hideGroupedColumn: true
        })

    });
}


function lockedGridPanel(parameterGridPanel){
 
    return new Ext.grid.GridPanel({
        loadMask:true,
        stripeRows: true,
        stripeRows: parameterGridPanel.stripeRows,
        store: parameterGridPanel.store,
        title :parameterGridPanel.title,
        renderTo:parameterGridPanel.renderTo,
        height : parameterGridPanel.height,
        //autoHeight : true,
        iconCls: parameterGridPanel.iconCls,
        sm: parameterGridPanel.sm,
        colModel : parameterGridPanel.colModel,
        tbar:  parameterGridPanel.tbar,
        view : parameterGridPanel.view,	
        bbar: new Ext.PagingToolbar({
            pageSize: parameterGridPanel.bbar.pageSize,
            store: parameterGridPanel.bbar.store,
            displayInfo: parameterGridPanel.bbar.displayInfo,
            displayMsg:  parameterGridPanel.bbar.displayMsg,
            emptyMsg: parameterGridPanel.bbar.emptyMsg
        })

    });
}

function lockedEditorGridPanel(parameterGridPanel){

    return new Ext.grid.EditorGridPanel({
        loadMask:true,
        stripeRows: true,
		view: new Ext.ux.grid.LockingGridView(),
        store: parameterGridPanel.store,
        title :parameterGridPanel.title,
        renderTo:parameterGridPanel.renderTo,
        height : parameterGridPanel.height,
        //autoHeight : true,
        iconCls: parameterGridPanel.iconCls,
        sm: parameterGridPanel.sm,
        colModel : parameterGridPanel.colModel,
        tbar:  parameterGridPanel.tbar,
        bbar: new Ext.PagingToolbar({
            pageSize: parameterGridPanel.bbar.pageSize,
            store: parameterGridPanel.bbar.store,
            displayInfo: parameterGridPanel.bbar.displayInfo,
            displayMsg:  parameterGridPanel.bbar.displayMsg,
            emptyMsg: parameterGridPanel.bbar.emptyMsg
        })

    });
}




//RP
function renderRP(value, metaData, record, rowIndex, colIndex, store) {
	if(value=="" || value==0 || value==null) 
	{
		value=0; 
		return 'Rp.0';  
	}
	
	var s = Ext.util.Format.usMoney(value);
	if(value.toString().indexOf("-")!= -1)
	{
		return '-Rp.' + s.substring(2, s.indexOf('.'));  
	}else 
	{
		return 'Rp.' + s.substring(1, s.indexOf('.'));  
	}
}

//$
function renderDollar(value, metaData, record, rowIndex, colIndex, store) {
	if(value=="" || value==0 || value==null) 
	{
		value=0; 
		return '$0';  
	}
	
	var s = Ext.util.Format.usMoney(value);
	if(value.toString().indexOf("-")!= -1)
	{
		return '-$' + s.substring(2, s.indexOf('.'));  
	}else 
	{
		return '$' + s.substring(1, s.indexOf('.'));  
	}
}

//noCurrency
function renderNoCurrency(value, metaData, record, rowIndex, colIndex, store) {
	if(value=="" || value==0 || value==null) 
	{
		value=0; 
		return '0';  
	}
	
	var s = Ext.util.Format.usMoney(value);
	if(value.toString().indexOf("-")!= -1)
	{
		return '-' + s.substring(2, s.indexOf('.'));  
	}else 
	{
		return '' + s.substring(1, s.indexOf('.'));  
	}
}

//extend method
Ext.apply(Ext.form.VTypes,{
    phoneText: "Not a valid phone number.  Must be in the format 123-4567 or 123-456-7890.",
    phoneMask: /[\d-]/,
    phoneRe: /^(\d{3}[-]?){1,2}(\d{4})$/,
    phone : function (v) {
        return this.phoneRe.test(v);
    },
    numericText: "Only numbers are allowed.",
    numericMask: /[0-9]/,
    numericRe: /(^-?\d\d*\.\d*$)|(^-?\d\d*$)|(^-?\.\d\d*$)/,
    numeric :function (v) {
        return this.numericRe.test(v);
    },
    decNumText: "Only decimal numbers are allowed.",
    decNumMask: /(\d|\.)/,
    decNumRe: /\d+\.\d+|\d+/,
    decNum : function (v) {
        return this.decNumRe.test(v);
    }
});

//row Page Numbererer
Ext.ux.grid.RowNumberer = Ext.extend(Ext.grid.RowNumberer, {
     renderer: function(v, p, record, rowIndex) {
        if (this.rowspan) {
            p.cellAttr = 'rowspan="'+this.rowspan+'"';
        }
        var st = record.store;
        if (st.lastOptions.params && st.lastOptions.params.start != undefined && st.lastOptions.params.limit != undefined) {
            var page = Math.floor(st.lastOptions.params.start/st.lastOptions.params.limit);
            var limit = st.lastOptions.params.limit;
            return limit*page + rowIndex+1;
        }else{
            return rowIndex+1;
        }
    }
});

function daterangeval(export_excel_params, fpFilter){
	Ext.apply(Ext.form.VTypes, {
		daterange : function(val, field) {
			var days = export_excel_params * 7;
			var date = field.parseDate(val);
			var newDate;
			
			if(!date){
				return false;
			}
			
			if (field.startDateField) {
				var start = fpFilter.getForm().findField(field.startDateField);
				newDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() - days);
				if (!start.maxValue || (date.getTime() != start.maxValue.getTime())) {
					start.setMaxValue(date);
					start.setMinValue(newDate);
					
					start.validate();
				}
			}
			else if (field.endDateField) {
				var end = fpFilter.getForm().findField(field.endDateField);
				newDate = new Date(date.getFullYear(), date.getMonth(), date.getDate() + days);
				if (!end.minValue || (date.getTime() != end.minValue.getTime())) {
					end.setMinValue(date);
					end.setMaxValue(newDate);
					end.setValue(newDate);
					end.validate();
				}
			}
			/*
			 * Always return true since we're only using this vtype to set the
			 * min/max allowed values (these are tested for after the vtype test)
			 */
			return true;
		},

        daterangeText: 'Start date must be less than end date'
	});
}

function resetdates(fields, fpFilter){
	for (i = 0; i < fields.length; i++) {
		fpFilter.getForm().findField(fields[i]).setMinValue(null);
		fpFilter.getForm().findField(fields[i]).setMaxValue(null);
	}
}
 
function alertInfo(msgInfo){
	 Ext.Msg.show({
			title: 'Info',
			msg : msgInfo,
			buttons: Ext.MessageBox.OK,
			icon:'ext-mb-info'
	});
}

function alertWarning(msgInfo){
	 Ext.Msg.show({
			title: 'Warning',
			msg : msgInfo,
			buttons: Ext.MessageBox.OK,
			icon:'ext-mb-warning'
	});
}


function alertError(msgInfo){
	 Ext.Msg.show({
                title: 'Error!',
                msg : msgInfo,
                buttons: Ext.MessageBox.OK,
                icon:'ext-mb-error'
               });
}

