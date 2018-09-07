/* Javascript Configuration/Settings
 * Sandy Haryono <sandy@indopay.com>
 *  
 */

 
var indopay = { 
    ui :{
        config : {
            pageLimit : 50,
            comboPageLimit : 10 
        },
        terminalStatuses : {
		        	deployed 	 		: { style : 'style="background-color:forestgreen;color:white;"'  } ,
		        	onprogress 	 		: { style : 'style="background-color:lightseagreen;color:white";'  } ,
		        	canceled 	 		: { style : 'style="background-color:pink;color:black";'  } ,
		        	pullout 	 		: { style : 'style="background-color:yellow;color:black;"'  } ,
		        	pulloutbymerchant 	: { style : 'style="background-color:darkmagenta;color:white;"'  } ,
		        	pending 	 		: { style : 'style="background-color:magenta;color:white;"'  } ,
		        	rejected 	 		: { style : 'style="background-color:red;color:white;"'  },
		        	maintenance  		: { style : 'style="background-color:cyan;color:black;"'  },
		        	reqpullout   		: { style : 'style="background-color:orange;color:black;"'  },
		        	reqpulloutproblem   : { style : 'style="background-color:#900C3F;color:black;"'  },		        	
		        	reqmaintenance 		: { style : 'style="background-color:aqua;color:black;"'  },
		        	replace				: { style : 'style="background-color:greenyellow;color:black;"'  },
		        	merchantproblem 	: { style : 'style="background-color:black;color:white;"'  },
		        	pulloutbybank 		: { style : 'style="background-color:OrangeRed;color:white;"'  },
					readytodeploy   	: { style : 'style="background-color:#cc99ff;color:white;"'  },
					onprogressreplace   : { style : 'style="background-color:#80ff00;color:white;"'  },
					onprogressprofile   : { style : 'style="background-color:#8000ff;color:white;"'  },
					onprogressdeploy    : { style : 'style="background-color:#ff0080;color:white;"'  },
					readytoreinit	    : { style : 'style="background-color:purple;color:white;"'  } 
					
					
					
			        	
	        },
	    callcenterStatuses : {
	    			open 			:  { style : 'style="background-color:red;color:white;"'},
	    			tsescalation 	:  { style : 'style="background-color:forestgreen;color:white;"'},
	    			edcdelivered 	:  { style : 'style="background-color:magenta;color:white;"'  },
	    			tsonsite 		:  { style : 'style="background-color:yellow;color:black;"'  },
	    			closedsolved 	:  { style : 'style="background-color:lightseagreen;color:white;"'  }
	    			},
	    SLAReport : {
		    		achieved 		:  { style : 'style="background-color:green;color:white;"'  },
		    		warning 		:  { style : 'style="background-color:yellow;color:white;"'  },
		    		notachieved 	:  { style : 'style="background-color:red;color:white;"'  }
		    		},
        taskStatus : {
		    		 done			:  { style : 'style="background-color:green;color:white;"'  },
		    		 open 		    :  { style : 'style="background-color:OrangeRed;color:white;"'  } 
		    		},
		    		
		claimStatus : {
			    	open			:  { style : 'style="background-color:yellow;color:black;"'  },
			    	rejected 		    :  { style : 'style="background-color:red;color:white;"'  },
			    	approved 		    :  { style : 'style="background-color:green;color:white;"'  },
			    	checked 		    :  { style : 'style="background-color:orange;color:white;"'  } 
			    	},
		claimSummaryStatus : {
				    validating			:  { style : 'style="background-color:orange;color:white;"'  },
				    validated 		    :  { style : 'style="background-color:blue;color:white;"'  },
				    transferred 		    :  { style : 'style="background-color:green;color:white;"'  },
				    confirmed 		    :  { style : 'style="background-color:lightseagreen;color:white;"'  } 
				    },
		values : { 
					kanwil : 
							[   ['KANWIL I', 'KANWIL I'],
								['KANWIL II', 'KANWIL II'],
								['KANWIL III', 'KANWIL III'],
								['KANWIL IV', 'KANWIL IV'],
								['KANWIL V', 'KANWIL V'],
								['KANWIL VI', 'KANWIL VI'],
								['KANWIL VII', 'KANWIL VII'],
								['KANWIL VIII', 'KANWIL VIII'],
								['KANWIL IX', 'KANWIL IX'],
								['KANWIL XI', 'KANWIL XI'],
								['KANWIL X', 'KANWIL X'],
								['KANWIL XII', 'KANWIL XII'],
								['HOLDING', 'HOLDING']
							  ]
				 , rootCause : [ ['ALAMAT MERCHANT TIDAK DITEMUKAN','ALAMAT MERCHANT TIDAK DITEMUKAN'],
								['ALAMAT/NAMA/DATA MERCHANT VS SPK "BERBEDA"','ALAMAT/NAMA/DATA MERCHANT VS SPK "BERBEDA"'],
								['BELUM ADA KONFIRMASI DARI KANTOR PUSAT MERCHANT','BELUM ADA KONFIRMASI DARI KANTOR PUSAT MERCHANT'],
								['BELUM ADA KONFIRMASI DARI PIHAK OWNER','BELUM ADA KONFIRMASI DARI PIHAK OWNER'],
								['DIPENDING ATAS PERMINTAAN BANK MANDIRI','DIPENDING ATAS PERMINTAAN BANK MANDIRI'],
								['EDC BELUM DISIAPKAN DARI MANDIRI','EDC BELUM DISIAPKAN DARI MANDIRI'],
								['EDC/DONGLE/SIM CARD/SAM CARD PROBLEM','EDC/DONGLE/SIM CARD/SAM CARD PROBLEM'],
								['LINE TELEPON BELUM SIAP','LINE TELEPON BELUM SIAP'],
								['LOKASI MERCHANT BELUM SIAP','LOKASI MERCHANT BELUM SIAP'],
								['LINE TELEPON BERMASALAH','LINE TELEPON BERMASALAH'],
								['MERCHANT MENOLAK PASANG','MERCHANT MENOLAK PASANG'],
								['MERCHANT MINTA EDC TYPE FIXLINE ( LEBIH SIMPLE )','MERCHANT MINTA EDC TYPE FIXLINE ( LEBIH SIMPLE )'],
								['MERCHANT MINTA PENAMBAHAN FITUR','MERCHANT MINTA PENAMBAHAN FITUR'],
								['MERCHANT TUTUP OPERASIONAL','MERCHANT TUTUP OPERASIONAL'],
								['MERCHANT TUTUP PERMANEN','MERCHANT TUTUP PERMANEN'],
								['MERCHANT TUTUP PINDAH','MERCHANT TUTUP PINDAH'],
								['MERCHANT TUTUP RENOVASI','MERCHANT TUTUP RENOVASI'],
								['REQUEST TYPE EDC GPRS','REQUEST TYPE EDC GPRS'],
								['RE-SCHEDULE KUNJUNGAN','RE-SCHEDULE KUNJUNGAN'],
								['SINYAL GPRS DOWN','SINYAL GPRS DOWN'],
								['SPK MILIK VENDOR LAIN','SPK MILIK VENDOR LAIN'],
								['TIDAK PERNAH MENERIMA SPK','TIDAK PERNAH MENERIMA SPK']
								] 
				, mandiriStatus :[ ['DONE', 'DONE'],
                                   ['CANCEL', 'CANCEL'],
                                   ['SCHEDULE', 'SCHEDULE'],
								   ['PENDING', 'PENDING'],
                                   ['OPEN PENDING BANK', 'OPEN PENDING BANK'],
                                   ['OPEN PENDING MERCHANT', 'OPEN PENDING MERCHANT']
                                ]
				
				}
		}
    
         
};


