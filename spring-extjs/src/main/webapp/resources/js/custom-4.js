 
//name Space 
//Ext.ns('Ext.ux.grid');
//Ext.ns('Ext.ux');


function formPanel(parameter){

    return Ext.create('Ext.form.Panel',{
    	
    	bodyCfg : parameter.bodyCfg || {},  
        fileUpload : parameter.fileUpload || false,
        layout: parameter.layout || 'form',
        buttonAlign : parameter.buttonAlign || 'left',
        layout: { pack: 'start' | 'center' | 'end' },
        fieldDefaults: { labelWidth: parameter.labelWidth || 200,
        				 labelAlign: parameter.labelAlign || 'left' },
               
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

    return Ext.create('Ext.grid.Panel',{
        loadMask:true,
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
	var cellEditing = Ext.create('Ext.grid.plugin.CellEditing', {
        clicksToEdit: 1
    });
	
    return Ext.create('Ext.grid.Panel',{
        loadMask:true,
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
        }),
        plugins: [cellEditing]

    });
}







//extend method
Ext.extend(Ext.form.VTypes,{
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
Ext.define('Ext.ux.grid.RowNumberer', {
	extend:'Ext.grid.RowNumberer',
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
  


