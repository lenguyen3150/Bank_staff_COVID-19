package hybridmodel;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Currency;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.Timer;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.awt.Color;
import java.awt.Font;
import com.anylogic.engine.connectivity.ResultSet;
import com.anylogic.engine.connectivity.Statement;
import com.anylogic.engine.elements.*;
import com.anylogic.engine.markup.Network;
import com.anylogic.engine.Position;
import com.anylogic.engine.markup.PedFlowStatistics;
import com.anylogic.engine.markup.DensityMap;


import static java.lang.Math.*;
import static com.anylogic.engine.UtilitiesArray.*;
import static com.anylogic.engine.UtilitiesCollection.*;
import static com.anylogic.engine.presentation.UtilitiesColor.*;
import static com.anylogic.engine.HyperArray.*;

import com.anylogic.engine.*;
import com.anylogic.engine.analysis.*;
import com.anylogic.engine.connectivity.*;
import com.anylogic.engine.database.*;
import com.anylogic.engine.gis.*;
import com.anylogic.engine.markup.*;
import com.anylogic.engine.routing.*;
import com.anylogic.engine.presentation.*;
import com.anylogic.engine.gui.*;

import com.anylogic.libraries.modules.markup_descriptors.*;

import com.querydsl.core.Tuple;
import com.querydsl.sql.SQLBindings;
import static hybridmodel.DBDescriptor.*;

import java.awt.geom.Arc2D;

public class Home extends Agent
{
  // Parameters

  /**
   * The identity of the care home
   */
  public 
int  ID;

  /**
   * Returns default value for parameter <code>ID</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _ID_DefaultValue_xjal() {
    final Home self = this;
    return 
0 
;
  }

  public void set_ID( int value ) {
    if (value == this.ID) {
      return;
    }
    int _oldValue_xjal = this.ID;
    this.ID = value;
    onChange_ID_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter ID.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_ID()</code> method instead.
   */
  protected void onChange_ID() {
    onChange_ID_xjal( ID );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_ID_xjal( int oldValue ) {  
  }


  /**
   * The identity of the care home sub-group to which a care home belongs
   */
  public 
int  GroupID;

  /**
   * Returns default value for parameter <code>GroupID</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _GroupID_DefaultValue_xjal() {
    final Home self = this;
    return 
0 
;
  }

  public void set_GroupID( int value ) {
    if (value == this.GroupID) {
      return;
    }
    int _oldValue_xjal = this.GroupID;
    this.GroupID = value;
    onChange_GroupID_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter GroupID.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_GroupID()</code> method instead.
   */
  protected void onChange_GroupID() {
    onChange_GroupID_xjal( GroupID );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_GroupID_xjal( int oldValue ) {  
  }


  public 
int  NSharedSs;

  /**
   * Returns default value for parameter <code>NSharedSs</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _NSharedSs_DefaultValue_xjal() {
    final Home self = this;
    return 
0 
;
  }

  public void set_NSharedSs( int value ) {
    if (value == this.NSharedSs) {
      return;
    }
    int _oldValue_xjal = this.NSharedSs;
    this.NSharedSs = value;
    onChange_NSharedSs_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter NSharedSs.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_NSharedSs()</code> method instead.
   */
  protected void onChange_NSharedSs() {
    onChange_NSharedSs_xjal( NSharedSs );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_NSharedSs_xjal( int oldValue ) {  
  }


  /**
   * PCR testing interval
   */
  public 
int  TestInterval;

  /**
   * Returns default value for parameter <code>TestInterval</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _TestInterval_DefaultValue_xjal() {
    final Home self = this;
    return 
7 
;
  }

  public void set_TestInterval( int value ) {
    if (value == this.TestInterval) {
      return;
    }
    int _oldValue_xjal = this.TestInterval;
    this.TestInterval = value;
    onChange_TestInterval_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter TestInterval.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_TestInterval()</code> method instead.
   */
  protected void onChange_TestInterval() {
    onChange_TestInterval_xjal( TestInterval );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_TestInterval_xjal( int oldValue ) {  
  }


  /**
   * The turnaround time of PCR tests
   */
  public 
double  TRT;

  /**
   * Returns default value for parameter <code>TRT</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _TRT_DefaultValue_xjal() {
    final Home self = this;
    return 
2 
;
  }

  public void set_TRT( double value ) {
    if (value == this.TRT) {
      return;
    }
    double _oldValue_xjal = this.TRT;
    this.TRT = value;
    onChange_TRT_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter TRT.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_TRT()</code> method instead.
   */
  protected void onChange_TRT() {
    onChange_TRT_xjal( TRT );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_TRT_xjal( double oldValue ) {  
  }


  public 
double  TestON;

  /**
   * Returns default value for parameter <code>TestON</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _TestON_DefaultValue_xjal() {
    final Home self = this;
    return 
95 
;
  }

  public void set_TestON( double value ) {
    if (value == this.TestON) {
      return;
    }
    double _oldValue_xjal = this.TestON;
    this.TestON = value;
    onChange_TestON_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter TestON.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_TestON()</code> method instead.
   */
  protected void onChange_TestON() {
    onChange_TestON_xjal( TestON );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_TestON_xjal( double oldValue ) {  
  }


  public 
double  TestReturn;

  /**
   * Returns default value for parameter <code>TestReturn</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _TestReturn_DefaultValue_xjal() {
    final Home self = this;
    return 
2 
;
  }

  public void set_TestReturn( double value ) {
    if (value == this.TestReturn) {
      return;
    }
    double _oldValue_xjal = this.TestReturn;
    this.TestReturn = value;
    onChange_TestReturn_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter TestReturn.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_TestReturn()</code> method instead.
   */
  protected void onChange_TestReturn() {
    onChange_TestReturn_xjal( TestReturn );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_TestReturn_xjal( double oldValue ) {  
  }


  public 
int  NSharedIs;

  /**
   * Returns default value for parameter <code>NSharedIs</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _NSharedIs_DefaultValue_xjal() {
    final Home self = this;
    return 
0 
;
  }

  public void set_NSharedIs( int value ) {
    if (value == this.NSharedIs) {
      return;
    }
    int _oldValue_xjal = this.NSharedIs;
    this.NSharedIs = value;
    onChange_NSharedIs_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter NSharedIs.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_NSharedIs()</code> method instead.
   */
  protected void onChange_NSharedIs() {
    onChange_NSharedIs_xjal( NSharedIs );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_NSharedIs_xjal( int oldValue ) {  
  }


  public 
int  NShared;

  /**
   * Returns default value for parameter <code>NShared</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _NShared_DefaultValue_xjal() {
    final Home self = this;
    return 
0 
;
  }

  public void set_NShared( int value ) {
    if (value == this.NShared) {
      return;
    }
    int _oldValue_xjal = this.NShared;
    this.NShared = value;
    onChange_NShared_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter NShared.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_NShared()</code> method instead.
   */
  protected void onChange_NShared() {
    onChange_NShared_xjal( NShared );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_NShared_xjal( int oldValue ) {  
  }


  public 
int  Nr;

  /**
   * Returns default value for parameter <code>Nr</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _Nr_DefaultValue_xjal() {
    final Home self = this;
    return 
80 
;
  }

  public void set_Nr( int value ) {
    if (value == this.Nr) {
      return;
    }
    int _oldValue_xjal = this.Nr;
    this.Nr = value;
    onChange_Nr_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Nr.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Nr()</code> method instead.
   */
  protected void onChange_Nr() {
    onChange_Nr_xjal( Nr );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Nr_xjal( int oldValue ) {  
  }


  public 
int  Ns;

  /**
   * Returns default value for parameter <code>Ns</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _Ns_DefaultValue_xjal() {
    final Home self = this;
    return 
70 
;
  }

  public void set_Ns( int value ) {
    if (value == this.Ns) {
      return;
    }
    int _oldValue_xjal = this.Ns;
    this.Ns = value;
    onChange_Ns_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Ns.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Ns()</code> method instead.
   */
  protected void onChange_Ns() {
    onChange_Ns_xjal( Ns );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Ns_xjal( int oldValue ) {  
  }


  public 
double  Usage;

  /**
   * Returns default value for parameter <code>Usage</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Usage_DefaultValue_xjal() {
    final Home self = this;
    return 
main.Usage 
;
  }

  public void set_Usage( double value ) {
    if (value == this.Usage) {
      return;
    }
    double _oldValue_xjal = this.Usage;
    this.Usage = value;
    onChange_Usage_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Usage.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Usage()</code> method instead.
   */
  protected void onChange_Usage() {
    onChange_Usage_xjal( Usage );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Usage_xjal( double oldValue ) {  
  }


  public 
double  Nu;

  /**
   * Returns default value for parameter <code>Nu</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Nu_DefaultValue_xjal() {
    final Home self = this;
    return 
0 
;
  }

  public void set_Nu( double value ) {
    if (value == this.Nu) {
      return;
    }
    double _oldValue_xjal = this.Nu;
    this.Nu = value;
    onChange_Nu_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Nu.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Nu()</code> method instead.
   */
  protected void onChange_Nu() {
    onChange_Nu_xjal( Nu );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Nu_xjal( double oldValue ) {  
  }


  public 
double  Outbreak;

  /**
   * Returns default value for parameter <code>Outbreak</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Outbreak_DefaultValue_xjal() {
    final Home self = this;
    return 
0 
;
  }

  public void set_Outbreak( double value ) {
    if (value == this.Outbreak) {
      return;
    }
    double _oldValue_xjal = this.Outbreak;
    this.Outbreak = value;
    onChange_Outbreak_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Outbreak.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Outbreak()</code> method instead.
   */
  protected void onChange_Outbreak() {
    onChange_Outbreak_xjal( Outbreak );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Outbreak_xjal( double oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    ID = _ID_DefaultValue_xjal();
    GroupID = _GroupID_DefaultValue_xjal();
    NSharedSs = _NSharedSs_DefaultValue_xjal();
    TestInterval = _TestInterval_DefaultValue_xjal();
    TRT = _TRT_DefaultValue_xjal();
    TestON = _TestON_DefaultValue_xjal();
    TestReturn = _TestReturn_DefaultValue_xjal();
    NSharedIs = _NSharedIs_DefaultValue_xjal();
    NShared = _NShared_DefaultValue_xjal();
    Nr = _Nr_DefaultValue_xjal();
    Ns = _Ns_DefaultValue_xjal();
    Usage = _Usage_DefaultValue_xjal();
    Nu = _Nu_DefaultValue_xjal();
    Outbreak = _Outbreak_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "ID":
      if ( _callOnChange_xjal ) {
        set_ID( ((Number) _value_xjal).intValue() );
      } else {
        ID = ((Number) _value_xjal).intValue();
      }
      return true;
    case "GroupID":
      if ( _callOnChange_xjal ) {
        set_GroupID( ((Number) _value_xjal).intValue() );
      } else {
        GroupID = ((Number) _value_xjal).intValue();
      }
      return true;
    case "NSharedSs":
      if ( _callOnChange_xjal ) {
        set_NSharedSs( ((Number) _value_xjal).intValue() );
      } else {
        NSharedSs = ((Number) _value_xjal).intValue();
      }
      return true;
    case "TestInterval":
      if ( _callOnChange_xjal ) {
        set_TestInterval( ((Number) _value_xjal).intValue() );
      } else {
        TestInterval = ((Number) _value_xjal).intValue();
      }
      return true;
    case "TRT":
      if ( _callOnChange_xjal ) {
        set_TRT( ((Number) _value_xjal).doubleValue() );
      } else {
        TRT = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "TestON":
      if ( _callOnChange_xjal ) {
        set_TestON( ((Number) _value_xjal).doubleValue() );
      } else {
        TestON = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "TestReturn":
      if ( _callOnChange_xjal ) {
        set_TestReturn( ((Number) _value_xjal).doubleValue() );
      } else {
        TestReturn = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "NSharedIs":
      if ( _callOnChange_xjal ) {
        set_NSharedIs( ((Number) _value_xjal).intValue() );
      } else {
        NSharedIs = ((Number) _value_xjal).intValue();
      }
      return true;
    case "NShared":
      if ( _callOnChange_xjal ) {
        set_NShared( ((Number) _value_xjal).intValue() );
      } else {
        NShared = ((Number) _value_xjal).intValue();
      }
      return true;
    case "Nr":
      if ( _callOnChange_xjal ) {
        set_Nr( ((Number) _value_xjal).intValue() );
      } else {
        Nr = ((Number) _value_xjal).intValue();
      }
      return true;
    case "Ns":
      if ( _callOnChange_xjal ) {
        set_Ns( ((Number) _value_xjal).intValue() );
      } else {
        Ns = ((Number) _value_xjal).intValue();
      }
      return true;
    case "Usage":
      if ( _callOnChange_xjal ) {
        set_Usage( ((Number) _value_xjal).doubleValue() );
      } else {
        Usage = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Nu":
      if ( _callOnChange_xjal ) {
        set_Nu( ((Number) _value_xjal).doubleValue() );
      } else {
        Nu = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Outbreak":
      if ( _callOnChange_xjal ) {
        set_Outbreak( ((Number) _value_xjal).doubleValue() );
      } else {
        Outbreak = ((Number) _value_xjal).doubleValue();
      }
      return true;
    default:
      return super.setParameter( _name_xjal, _value_xjal, _callOnChange_xjal );
    }
  }

  @Override
  public <T> T getParameter(String _name_xjal) {
    Object _result_xjal;
    switch ( _name_xjal ) {
    case "ID": _result_xjal = ID; break;
    case "GroupID": _result_xjal = GroupID; break;
    case "NSharedSs": _result_xjal = NSharedSs; break;
    case "TestInterval": _result_xjal = TestInterval; break;
    case "TRT": _result_xjal = TRT; break;
    case "TestON": _result_xjal = TestON; break;
    case "TestReturn": _result_xjal = TestReturn; break;
    case "NSharedIs": _result_xjal = NSharedIs; break;
    case "NShared": _result_xjal = NShared; break;
    case "Nr": _result_xjal = Nr; break;
    case "Ns": _result_xjal = Ns; break;
    case "Usage": _result_xjal = Usage; break;
    case "Nu": _result_xjal = Nu; break;
    case "Outbreak": _result_xjal = Outbreak; break;
    default: _result_xjal = super.getParameter( _name_xjal ); break;
    }
    return (T) _result_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private static String[] _parameterNames_xjal;

  @Override
  public String[] getParameterNames() {
    String[] result = _parameterNames_xjal;
    if (result == null) {
      List<String> list = new ArrayList<>( Arrays.asList( super.getParameterNames() ) );
      list.add( "ID" );
      list.add( "GroupID" );
      list.add( "NSharedSs" );
      list.add( "TestInterval" );
      list.add( "TRT" );
      list.add( "TestON" );
      list.add( "TestReturn" );
      list.add( "NSharedIs" );
      list.add( "NShared" );
      list.add( "Nr" );
      list.add( "Ns" );
      list.add( "Usage" );
      list.add( "Nu" );
      list.add( "Outbreak" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }

  // Dynamic (Flow/Auxiliary/Stock) Variables

  /**
   * Residents become infectious 
   */
  public double Flow_ErIr;

  /**
   * Transmission to susceptible residents 
   */
  public double Flow_SrEr;

  /**
   * Recovery of infected residents 
   */
  public double Flow_IrRr;

  /**
   * Death/Discharge of residents due to other reasons   
   */
  public double Outflow_Rr;

  /**
   * All residents admitted to a care home are susceptible as they receive two compulsory tests and are isolated for 14 days upon admission.<br>
   * Care homes operate at a full capacity.
   */
  public double Inflow_Sr;

  /**
   * Transmission to susceptible staff 
   */
  public double Flow_SsEs;

  /**
   * Staff becoming infectious 
   */
  public double Flow_EsIs;

  /**
   * Recovery of infected staff
   */
  public double Flow_IsRs;

  /**
   * Death of residents due to COVID-19 
   */
  public double Outflow_Ir;

  /**
   * Death of staff due to COVID-19
   */
  public double Outflow_Is;

  /**
   * Permanent staff who leave a care home are replaced by new recruited permanent staff. <br>
   * All new recruited staff are susceptible.
   */
  public double Inflow_Ss;

  /**
   * Staff turnover
   */
  public double Outflow_Rs;

  /**
   * Isolation of residents when developing symptoms 
   */
  public double Flow_IrQr;

  /**
   * End of isolation period
   */
  public double Flow_QrRr;

  /**
   * Death of residents due to COVID-19 
   */
  public double Outflow_Qr;

  /**
   * End of self-isolation period
   */
  public double Flow_QsRs;

  /**
   * Self-isolation of staff when developing symptoms
   */
  public double Flow_IsQs;

  /**
   * Death of staff due to COVID-19
   */
  public double Outflow_Qs;

  public double Flow_EsDEs;

  public double Flow_DEsQs;

  /**
   * Infected staff detected by testing 
   */
  public double Flow_IsDIs;

  public double Flow_DIsQs;

  /**
   * Staff becoming infectious 
   */
  public double Flow_DEsDIs;

  public double Transmission_Residents;

  public double Transmission_Staff;

  public double Death_Residents;

  public double flow;

  public double flow1;

  public double ContactRR;

  public double IP;

  public double ExposedTime;

  public double RAND1;

  public double BetaRR;

  public double InfectiousTime;

  public double LeavingRate;

  public double RAND4;

  public double ContactSS;

  public double BetaSS;

  public double IFR;

  public double ContactSR;

  public double BetaSR;

  public double RAND8;

  public double RAND9;

  public double BetaRS;

  public double ContactRS;

  public double IFRs;

  public double CommunityTransmission;

  public double Turnover;

  public double pSymp;

  public double PresympTime;

  /**
   * Isolation time
   */
  public double IsoTime;

  public double pSympS;

  public double RateIsQs;

  public double RateIsRs;

  public double RateIs;

  public double RateIrQr;

  public double RateIrRr;

  public double RateIr;

  public double TestingEs;

  public double TestSens;

  public double Rate_DEsQs;

  public double TestingIs;

  public double Rate_DIsQs;

  public double Rate_DEsDIs;

  public double pInfectedByResidents;

  public double pInfectedByStaff;

  public double SDCompliance;

  public double Nw;

  public double Sr;

  public double Er;

  public double Ir;

  public double Rr;

  public double Ss;

  public double Es;

  public double Is;

  public double Rs;

  public double Qr;

  public double Qs;

  public double DEs;

  public double DIs;

  public double CumIr;

  public double CumIs;

  public double CumDeath;

  public double TotalS;

  public double TotalR;
  @AnyLogicInternalCodegenAPI
  private VariableDelay _Flow_QrRr_formula_0_delay_xjal;
  @AnyLogicInternalCodegenAPI
  private VariableDelay _Outflow_Qr_formula_0_delay_xjal;
  @AnyLogicInternalCodegenAPI
  private VariableDelay _Flow_QsRs_formula_0_delay_xjal;
  @AnyLogicInternalCodegenAPI
  private VariableDelay _Outflow_Qs_formula_0_delay_xjal;
  @AnyLogicInternalCodegenAPI
  public double __Flow_QrRr_formula_0_delay_xjal_DelayTime_xjal() {
    return 
IsoTime 
;
  }
  @AnyLogicInternalCodegenAPI
  public double __Flow_QrRr_formula_0_delay_xjal_Input_xjal() {
    return 
Flow_IrQr * (1 - IFR) 
;
  }
  @AnyLogicInternalCodegenAPI
  public double __Flow_QrRr_formula_0_delay_xjal_InitialValue_xjal() {
    return 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public double __Outflow_Qr_formula_0_delay_xjal_DelayTime_xjal() {
    return 
IsoTime 
;
  }
  @AnyLogicInternalCodegenAPI
  public double __Outflow_Qr_formula_0_delay_xjal_Input_xjal() {
    return 
Flow_IrQr * IFR 
;
  }
  @AnyLogicInternalCodegenAPI
  public double __Outflow_Qr_formula_0_delay_xjal_InitialValue_xjal() {
    return 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public double __Flow_QsRs_formula_0_delay_xjal_DelayTime_xjal() {
    return 
IsoTime 
;
  }
  @AnyLogicInternalCodegenAPI
  public double __Flow_QsRs_formula_0_delay_xjal_Input_xjal() {
    return 
(Flow_IsQs + Flow_DEsQs + Flow_DIsQs) * (1 - IFRs) 
;
  }
  @AnyLogicInternalCodegenAPI
  public double __Outflow_Qs_formula_0_delay_xjal_DelayTime_xjal() {
    return 
IsoTime 
;
  }
  @AnyLogicInternalCodegenAPI
  public double __Outflow_Qs_formula_0_delay_xjal_Input_xjal() {
    return 
(Flow_IsQs + Flow_DEsQs + Flow_DIsQs) * IFRs 
;
  }
  /**
   * Writes model variables into given arrays
   */
  @AnyLogicInternalCodegenAPI
  public void getPhaseVector_xjal(double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal) {
    _d_xjal[ _d_idx_xjal + 0 ] = Sr;
    _d_xjal[ _d_idx_xjal + 1 ] = Er;
    _d_xjal[ _d_idx_xjal + 2 ] = Ir;
    _d_xjal[ _d_idx_xjal + 3 ] = Rr;
    _d_xjal[ _d_idx_xjal + 4 ] = Ss;
    _d_xjal[ _d_idx_xjal + 5 ] = Es;
    _d_xjal[ _d_idx_xjal + 6 ] = Is;
    _d_xjal[ _d_idx_xjal + 7 ] = Rs;
    _d_xjal[ _d_idx_xjal + 8 ] = Qr;
    _d_xjal[ _d_idx_xjal + 9 ] = Qs;
    _d_xjal[ _d_idx_xjal + 10 ] = DEs;
    _d_xjal[ _d_idx_xjal + 11 ] = DIs;
    _d_xjal[ _d_idx_xjal + 12 ] = CumIr;
    _d_xjal[ _d_idx_xjal + 13 ] = CumIs;
    _d_xjal[ _d_idx_xjal + 14 ] = CumDeath;
    _d_xjal[ _d_idx_xjal + 15 ] = TotalS;
    _d_xjal[ _d_idx_xjal + 16 ] = TotalR;
    _d_idx_xjal += 17;
    super.getPhaseVector_xjal(_d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal);
  }
  /**
   * Writes given arrays to model variables
   */
  @AnyLogicInternalCodegenAPI
  public void putPhaseVector_xjal(double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal) {
    Sr = _d_xjal[ _d_idx_xjal + 0 ];
    Er = _d_xjal[ _d_idx_xjal + 1 ];
    Ir = _d_xjal[ _d_idx_xjal + 2 ];
    Rr = _d_xjal[ _d_idx_xjal + 3 ];
    Ss = _d_xjal[ _d_idx_xjal + 4 ];
    Es = _d_xjal[ _d_idx_xjal + 5 ];
    Is = _d_xjal[ _d_idx_xjal + 6 ];
    Rs = _d_xjal[ _d_idx_xjal + 7 ];
    Qr = _d_xjal[ _d_idx_xjal + 8 ];
    Qs = _d_xjal[ _d_idx_xjal + 9 ];
    DEs = _d_xjal[ _d_idx_xjal + 10 ];
    DIs = _d_xjal[ _d_idx_xjal + 11 ];
    CumIr = _d_xjal[ _d_idx_xjal + 12 ];
    CumIs = _d_xjal[ _d_idx_xjal + 13 ];
    CumDeath = _d_xjal[ _d_idx_xjal + 14 ];
    TotalS = _d_xjal[ _d_idx_xjal + 15 ];
    TotalR = _d_xjal[ _d_idx_xjal + 16 ];
    _d_idx_xjal += 17;
    super.putPhaseVector_xjal(_d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal);
  }
  @AnyLogicInternalCodegenAPI
  public void assignInitialConditions_xjal() {
	super.assignInitialConditions_xjal(); 
    _assign_ContactRS_Formula_xjal();
    _assign_Nw_Formula_xjal();
    _assign_ContactRR_Formula_xjal();
    _assign_IP_Formula_xjal();
    _assign_LeavingRate_Formula_xjal();
    _assign_ContactSS_Formula_xjal();
    _assign_ContactSR_Formula_xjal();
    _assign_Turnover_Formula_xjal();
    _assign_RateIs_Formula_xjal();
    _assign_RateIr_Formula_xjal();
    _assign_SDCompliance_Formula_xjal();
    _assign_Ir_Formula_xjal();
    _assign_Rr_Formula_xjal();
    _assign_Is_Formula_xjal();
    _assign_Rs_Formula_xjal();
    _assign_DIs_Formula_xjal();
    _assign_Outflow_Rr_Formula_xjal();
    _assign_Outflow_Ir_Formula_xjal();
    _assign_Outflow_Is_Formula_xjal();
    _assign_Outflow_Rs_Formula_xjal();
    _assign_Outflow_Qr_Formula_xjal();
    _assign_Outflow_Qs_Formula_xjal();
    _assign_RAND1_Formula_xjal();
    _assign_BetaRR_Formula_xjal();
    _assign_RAND4_Formula_xjal();
    _assign_BetaSS_Formula_xjal();
    _assign_BetaSR_Formula_xjal();
    _assign_RAND8_Formula_xjal();
    _assign_RAND9_Formula_xjal();
    _assign_BetaRS_Formula_xjal();
    _assign_CommunityTransmission_Formula_xjal();
    _assign_Sr_Formula_xjal();
    _assign_Ss_Formula_xjal();
    _assign_Flow_SrEr_Formula_xjal();
    _assign_Inflow_Sr_Formula_xjal();
    _assign_Flow_SsEs_Formula_xjal();
    _assign_Inflow_Ss_Formula_xjal();
    _assign_ExposedTime_Formula_xjal();
    _assign_RateIsQs_Formula_xjal();
    _assign_RateIsRs_Formula_xjal();
    _assign_RateIrQr_Formula_xjal();
    _assign_RateIrRr_Formula_xjal();
    _assign_TestingEs_Formula_xjal();
    _assign_TestSens_Formula_xjal();
    _assign_Rate_DEsQs_Formula_xjal();
    _assign_TestingIs_Formula_xjal();
    _assign_Rate_DIsQs_Formula_xjal();
    _assign_Rate_DEsDIs_Formula_xjal();
    _assign_Er_Formula_xjal();
    _assign_Es_Formula_xjal();
    _assign_Flow_ErIr_Formula_xjal();
    _assign_Flow_IrRr_Formula_xjal();
    _assign_Flow_EsIs_Formula_xjal();
    _assign_Flow_IsRs_Formula_xjal();
    _assign_Flow_IrQr_Formula_xjal();
    _assign_Flow_QrRr_Formula_xjal();
    _assign_Flow_QsRs_Formula_xjal();
    _assign_Flow_IsQs_Formula_xjal();
    _assign_Flow_EsDEs_Formula_xjal();
    _assign_Flow_DEsQs_Formula_xjal();
    _assign_Flow_IsDIs_Formula_xjal();
    _assign_Flow_DIsQs_Formula_xjal();
    _assign_Flow_DEsDIs_Formula_xjal();
    _assign_Transmission_Residents_Formula_xjal();
    _assign_Transmission_Staff_Formula_xjal();
    _assign_Death_Residents_Formula_xjal();
    _assign_flow_Formula_xjal();
    _assign_flow1_Formula_xjal();
    _assign_InfectiousTime_Formula_xjal();
    _assign_IFR_Formula_xjal();
    _assign_IFRs_Formula_xjal();
    _assign_pSymp_Formula_xjal();
    _assign_PresympTime_Formula_xjal();
    _assign_IsoTime_Formula_xjal();
    _assign_pSympS_Formula_xjal();
    _assign_pInfectedByResidents_Formula_xjal();
    _assign_pInfectedByStaff_Formula_xjal();
    _assign_Qr_Formula_xjal();
    _assign_Qs_Formula_xjal();
    _assign_DEs_Formula_xjal();
    _assign_CumIr_Formula_xjal();
    _assign_CumIs_Formula_xjal();
    _assign_CumDeath_Formula_xjal();
    _assign_TotalS_Formula_xjal();
    _assign_TotalR_Formula_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void setupInitialConditions_xjal(Class<?> callerClass) {
    if (callerClass != Home.class) {
      return;
    }
    if (getInitialAlgebraicFlatEquationsCount_xjal() > 0) {
      SDIntegrationManager integrationManagerForInitialConditions = new SDIntegrationManager( 0, getInitialAlgebraicFlatEquationsCount_xjal(), getInitialFormulaFlatEquationsCount_xjal() );
      integrationManagerForInitialConditions.doStep( this, 0, 0.1, true );
    } else {
      assignInitialConditions_xjal();
    } 
  }
  
  @AnyLogicInternalCodegenAPI
  public void _assign_ContactRS_Formula_xjal() {
    ContactRS = 
main.ContactRS 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Nw_Formula_xjal() {
    Nw = 
0.4 * Ns 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_ContactRR_Formula_xjal() {
    ContactRR = 
main.ContactRR 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_IP_Formula_xjal() {
    IP = 
main.IP() 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_LeavingRate_Formula_xjal() {
    LeavingRate = 
0.004 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_ContactSS_Formula_xjal() {
    ContactSS = 
main.ContactSS 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_ContactSR_Formula_xjal() {
    ContactSR = 
ContactRS * Nr / (Nw - Nu) 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Turnover_Formula_xjal() {
    Turnover = 
main.Turnover/365 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RateIs_Formula_xjal() {
    RateIs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RateIr_Formula_xjal() {
    RateIr = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_SDCompliance_Formula_xjal() {
    SDCompliance = 
0.75 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Ir_Formula_xjal() {
    Ir = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Rr_Formula_xjal() {
    Rr = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Is_Formula_xjal() {
    Is = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Rs_Formula_xjal() {
    Rs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_DIs_Formula_xjal() {
    DIs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Outflow_Rr_Formula_xjal() {
    Outflow_Rr = 
Rr * LeavingRate 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Outflow_Ir_Formula_xjal() {
    Outflow_Ir = 
RateIr / 0.01 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Outflow_Is_Formula_xjal() {
    Outflow_Is = 
RateIs / 0.01 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Outflow_Rs_Formula_xjal() {
    Outflow_Rs = 
Rs * Turnover 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Outflow_Qr_Formula_xjal() {
    Outflow_Qr = 
_Outflow_Qr_formula_0_delay_xjal.getScalar() 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Outflow_Qs_Formula_xjal() {
    Outflow_Qs = 
_Outflow_Qs_formula_0_delay_xjal.getScalar() 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RAND1_Formula_xjal() {
    RAND1 = 
(Ir > 0)?(1 + 10 * normal(1.0) / sqrt(Ir)):0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_BetaRR_Formula_xjal() {
    BetaRR = 
IP * ContactRR * (1 - SDCompliance) 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RAND4_Formula_xjal() {
    RAND4 = 
((Is + DIs) > 0)?(1 + 10 * normal(1.0) / sqrt(Is + DIs)):0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_BetaSS_Formula_xjal() {
    BetaSS = 
IP * ContactSS * (1 - SDCompliance) 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_BetaSR_Formula_xjal() {
    BetaSR = 
IP * ContactSR 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RAND8_Formula_xjal() {
    RAND8 = 
(Ir > 0)?(1 + 10 * normal(1.0) / sqrt(Ir)):0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RAND9_Formula_xjal() {
    RAND9 = 
((Is + DIs) > 0)?(1 + 10 * normal(1.0) / sqrt(Is + DIs)):0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_BetaRS_Formula_xjal() {
    BetaRS = 
2 * IP * ContactRS 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_CommunityTransmission_Formula_xjal() {
    CommunityTransmission = 
main.CommunityTransmission 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Sr_Formula_xjal() {
    Sr = 
Nr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Ss_Formula_xjal() {
    Ss = 
Ns 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_SrEr_Formula_xjal() {
    Flow_SrEr = 
(Sr > 0)?(BetaRR * Sr * Ir* RAND1 / Nr + BetaRS * Sr * (Is + DIs)* RAND9* (Nw - NShared) / (Ns * (Nw - Nu)) + BetaRS * Sr * NSharedIs / (Nw - Nu)):0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Inflow_Sr_Formula_xjal() {
    Inflow_Sr = 
Outflow_Rr + Outflow_Ir + Outflow_Qr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_SsEs_Formula_xjal() {
    Flow_SsEs = 
(Ss > 0)?(BetaSS * Ss * ((Nw - NShared) / Ns)* ((Is + DIs) * (Nw - NShared) * RAND4 / (Ns * (Nw - Nu)) + NSharedIs / (Nw - Nu)) + BetaSR * Ss * (Nw - NShared)* Ir* RAND8 / (Nr * Ns) + Ss * CommunityTransmission * (1 + 10 * normal(1,0) / sqrt(Ss))):0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Inflow_Ss_Formula_xjal() {
    Inflow_Ss = 
Outflow_Is + Outflow_Rs + Outflow_Qs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_ExposedTime_Formula_xjal() {
    ExposedTime = 
4.6 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RateIsQs_Formula_xjal() {
    RateIsQs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RateIsRs_Formula_xjal() {
    RateIsRs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RateIrQr_Formula_xjal() {
    RateIrQr = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_RateIrRr_Formula_xjal() {
    RateIrRr = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_TestingEs_Formula_xjal() {
    TestingEs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_TestSens_Formula_xjal() {
    TestSens = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Rate_DEsQs_Formula_xjal() {
    Rate_DEsQs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_TestingIs_Formula_xjal() {
    TestingIs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Rate_DIsQs_Formula_xjal() {
    Rate_DIsQs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Rate_DEsDIs_Formula_xjal() {
    Rate_DEsDIs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Er_Formula_xjal() {
    Er = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Es_Formula_xjal() {
    Es = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_ErIr_Formula_xjal() {
    Flow_ErIr = 
(Er > 0)?(Er * (1 + 10 * normal(1.0) / sqrt(Er)) / ExposedTime):0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_IrRr_Formula_xjal() {
    Flow_IrRr = 
RateIrRr / 0.01 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_EsIs_Formula_xjal() {
    Flow_EsIs = 
(Es > 0)?((1 - TestSens) * Es * (1 + 10 * normal(1,0) / sqrt(Es)) / ExposedTime):0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_IsRs_Formula_xjal() {
    Flow_IsRs = 
RateIsRs / 0.01 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_IrQr_Formula_xjal() {
    Flow_IrQr = 
RateIrQr / 0.01 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_QrRr_Formula_xjal() {
    Flow_QrRr = 
_Flow_QrRr_formula_0_delay_xjal.getScalar() 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_QsRs_Formula_xjal() {
    Flow_QsRs = 
_Flow_QsRs_formula_0_delay_xjal.getScalar() 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_IsQs_Formula_xjal() {
    Flow_IsQs = 
RateIsQs / 0.01 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_EsDEs_Formula_xjal() {
    Flow_EsDEs = 
TestingEs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_DEsQs_Formula_xjal() {
    Flow_DEsQs = 
Rate_DEsQs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_IsDIs_Formula_xjal() {
    Flow_IsDIs = 
TestingIs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_DIsQs_Formula_xjal() {
    Flow_DIsQs = 
Rate_DIsQs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Flow_DEsDIs_Formula_xjal() {
    Flow_DEsDIs = 
Rate_DEsDIs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Transmission_Residents_Formula_xjal() {
    Transmission_Residents = 
Flow_SrEr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Transmission_Staff_Formula_xjal() {
    Transmission_Staff = 
Flow_SsEs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Death_Residents_Formula_xjal() {
    Death_Residents = 
Outflow_Qr + Outflow_Ir 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_flow_Formula_xjal() {
    flow = 
Inflow_Ss 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_flow1_Formula_xjal() {
    flow1 = 
Inflow_Sr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_InfectiousTime_Formula_xjal() {
    InfectiousTime = 
10 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_IFR_Formula_xjal() {
    IFR = 
0.359 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_IFRs_Formula_xjal() {
    IFRs = 
0.0007 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_pSymp_Formula_xjal() {
    pSymp = 
0.7 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_PresympTime_Formula_xjal() {
    PresympTime = 
2 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_IsoTime_Formula_xjal() {
    IsoTime = 
14 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_pSympS_Formula_xjal() {
    pSympS = 
main.pStaffSymp 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_pInfectedByResidents_Formula_xjal() {
    pInfectedByResidents = 
IP * ContactSR * Ir / Nr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_pInfectedByStaff_Formula_xjal() {
    pInfectedByStaff = 
BetaSS * ((Is + DIs) * (Nw - NShared) / (Ns * (Nw - Nu)) + NSharedIs / (Nw - Nu)) 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Qr_Formula_xjal() {
    Qr = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_Qs_Formula_xjal() {
    Qs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_DEs_Formula_xjal() {
    DEs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_CumIr_Formula_xjal() {
    CumIr = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_CumIs_Formula_xjal() {
    CumIs = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_CumDeath_Formula_xjal() {
    CumDeath = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_TotalS_Formula_xjal() {
    TotalS = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _assign_TotalR_Formula_xjal() {
    TotalR = 
0 
;
  }
  @AnyLogicInternalCodegenAPI
  public void formulasExecute_xjal() {
    super.formulasExecute_xjal();
    _assign_Nw_Formula_xjal();
    _assign_ContactSR_Formula_xjal();
    _assign_Outflow_Rr_Formula_xjal();
    _assign_Outflow_Ir_Formula_xjal();
    _assign_Outflow_Is_Formula_xjal();
    _assign_Outflow_Rs_Formula_xjal();
    _assign_Outflow_Qr_Formula_xjal();
    _assign_Outflow_Qs_Formula_xjal();
    _assign_RAND1_Formula_xjal();
    _assign_BetaRR_Formula_xjal();
    _assign_RAND4_Formula_xjal();
    _assign_BetaSS_Formula_xjal();
    _assign_BetaSR_Formula_xjal();
    _assign_RAND8_Formula_xjal();
    _assign_RAND9_Formula_xjal();
    _assign_BetaRS_Formula_xjal();
    _assign_CommunityTransmission_Formula_xjal();
    _assign_Flow_SrEr_Formula_xjal();
    _assign_Inflow_Sr_Formula_xjal();
    _assign_Flow_SsEs_Formula_xjal();
    _assign_Inflow_Ss_Formula_xjal();
    _assign_Flow_ErIr_Formula_xjal();
    _assign_Flow_IrRr_Formula_xjal();
    _assign_Flow_EsIs_Formula_xjal();
    _assign_Flow_IsRs_Formula_xjal();
    _assign_Flow_IrQr_Formula_xjal();
    _assign_Flow_QrRr_Formula_xjal();
    _assign_Flow_QsRs_Formula_xjal();
    _assign_Flow_IsQs_Formula_xjal();
    _assign_Flow_EsDEs_Formula_xjal();
    _assign_Flow_DEsQs_Formula_xjal();
    _assign_Flow_IsDIs_Formula_xjal();
    _assign_Flow_DIsQs_Formula_xjal();
    _assign_Flow_DEsDIs_Formula_xjal();
    _assign_Transmission_Residents_Formula_xjal();
    _assign_Transmission_Staff_Formula_xjal();
    _assign_Death_Residents_Formula_xjal();
    _assign_flow_Formula_xjal();
    _assign_flow1_Formula_xjal();
    _assign_pInfectedByResidents_Formula_xjal();
    _assign_pInfectedByStaff_Formula_xjal(); 
  }

  @AnyLogicInternalCodegenAPI
  public void getRightPart_xjal( double[] _d_xjal, int _d_idx_xjal, double[] _a_xjal, int _a_idx_xjal ) {
    _get_Sr_Derivative_xjal( _d_xjal, _d_idx_xjal + 0 );
    _get_Er_Derivative_xjal( _d_xjal, _d_idx_xjal + 1 );
    _get_Ir_Derivative_xjal( _d_xjal, _d_idx_xjal + 2 );
    _get_Rr_Derivative_xjal( _d_xjal, _d_idx_xjal + 3 );
    _get_Ss_Derivative_xjal( _d_xjal, _d_idx_xjal + 4 );
    _get_Es_Derivative_xjal( _d_xjal, _d_idx_xjal + 5 );
    _get_Is_Derivative_xjal( _d_xjal, _d_idx_xjal + 6 );
    _get_Rs_Derivative_xjal( _d_xjal, _d_idx_xjal + 7 );
    _get_Qr_Derivative_xjal( _d_xjal, _d_idx_xjal + 8 );
    _get_Qs_Derivative_xjal( _d_xjal, _d_idx_xjal + 9 );
    _get_DEs_Derivative_xjal( _d_xjal, _d_idx_xjal + 10 );
    _get_DIs_Derivative_xjal( _d_xjal, _d_idx_xjal + 11 );
    _get_CumIr_Derivative_xjal( _d_xjal, _d_idx_xjal + 12 );
    _get_CumIs_Derivative_xjal( _d_xjal, _d_idx_xjal + 13 );
    _get_CumDeath_Derivative_xjal( _d_xjal, _d_idx_xjal + 14 );
    _get_TotalS_Derivative_xjal( _d_xjal, _d_idx_xjal + 15 );
    _get_TotalR_Derivative_xjal( _d_xjal, _d_idx_xjal + 16 );
    _d_idx_xjal += 17; 
	super.getRightPart_xjal( _d_xjal, _d_idx_xjal, _a_xjal, _a_idx_xjal );
  }

  @AnyLogicInternalCodegenAPI
  public void _get_Sr_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Inflow_Sr - Flow_SrEr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_Er_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_SrEr - Flow_ErIr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_Ir_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_ErIr - Flow_IrRr - Outflow_Ir- Flow_IrQr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_Rr_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_IrRr + Flow_QrRr - Outflow_Rr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_Ss_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Inflow_Ss - Flow_SsEs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_Es_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_SsEs - Flow_EsIs - Flow_EsDEs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_Is_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_EsIs - Flow_IsRs - Outflow_Is- Flow_IsQs- Flow_IsDIs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_Rs_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_IsRs + Flow_QsRs - Outflow_Rs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_Qr_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_IrQr - Flow_QrRr - Outflow_Qr 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_Qs_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_IsQs + Flow_DEsQs + Flow_DIsQs - Flow_QsRs - Outflow_Qs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_DEs_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_EsDEs - Flow_DEsQs - Flow_DEsDIs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_DIs_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Flow_IsDIs + Flow_DEsDIs - Flow_DIsQs 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_CumIr_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Transmission_Residents 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_CumIs_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Transmission_Staff 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_CumDeath_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+Death_Residents 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_TotalS_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+flow 
;
  }
  @AnyLogicInternalCodegenAPI
  public void _get_TotalR_Derivative_xjal( double[] _d_xjal, int _d_idx_xjal ) {
    _d_xjal[ _d_idx_xjal ] = 
+flow1 
;
  }
  @AnyLogicInternalCodegenAPI
  protected SDIntegrationManager integrationManager_xjal = null;
  
  @AnyLogicInternalCodegenAPI
  public SDIntegrationManager getIntegrationManager_xjal() {
    if (integrationManager_xjal == null) {
      integrationManager_xjal = new SDIntegrationManager( getDifferentialFlatEquationsCount_xjal(), getRuntimeAlgebraicFlatEquationsCount_xjal(), getRuntimeFormulaFlatEquationsCount_xjal() );
    }
    return integrationManager_xjal;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public int getDifferentialFlatEquationsCount_xjal() {
    return super.getDifferentialFlatEquationsCount_xjal() + 17;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public int getRuntimeFormulaFlatEquationsCount_xjal() {
    return super.getRuntimeFormulaFlatEquationsCount_xjal() + 41;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getInitialFormulaFlatEquationsCount_xjal() {
    return super.getInitialFormulaFlatEquationsCount_xjal() + 85;
  }

  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Home.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final Scale scale = new Scale( 10.0 );

  @Override
  public Scale getScale() {
    return scale;
  }


  // Events

  public EventCondition OutbreakFirstOccurrence = new EventCondition(this);
  public EventTimeout Outflows_Ir = new EventTimeout(this);
  public EventTimeout Staff_Transitions = new EventTimeout(this);
  public EventTimeout Outflows_Is = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _InfectedResidentsDS_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _autoCreatedDS_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == Outflows_Ir ) return "Outflows_Ir";
     if( _e == Staff_Transitions ) return "Staff_Transitions";
     if( _e == Outflows_Is ) return "Outflows_Is";
     if( _e == _InfectedResidentsDS_autoUpdateEvent_xjal ) return "InfectedResidentsDS auto update event";
     if( _e == _autoCreatedDS_xjal ) return "Auto-created DataSets auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == Outflows_Ir ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == Staff_Transitions ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == Outflows_Is ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _InfectedResidentsDS_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _autoCreatedDS_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == Outflows_Ir ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == Staff_Transitions ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == Outflows_Is ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _InfectedResidentsDS_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _autoCreatedDS_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == Outflows_Ir) {
      _t = 
0.01 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == Staff_Transitions) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == Outflows_Is) {
      _t = 
0.01 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _InfectedResidentsDS_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _autoCreatedDS_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == Outflows_Ir ) {
      EventTimeout self = _e;

double RAND = (Ir>0)? (1 + 10*normal(1.0)/sqrt(Ir)) : 0;
RateIrQr = (Ir>0)? (0.01*pSymp*Ir*RAND/PresympTime)
:0;

RAND = (Ir>0)? (1 + 10*normal(1.0)/sqrt(Ir)) : 0;
RateIrRr = (Ir>0)?
(0.01*(1-pSymp)*Ir*(1-IFR)*RAND/InfectiousTime) 
: 0;

RAND = (Ir>0)? (1 + 10*normal(1.0)/sqrt(Ir)) : 0;
RateIr = (Ir>0)?
(0.01*(1-pSymp)*Ir*IFR*RAND/InfectiousTime) 
: 0;
 
;
      return;
    }
    if ( _e == Staff_Transitions ) {
      EventTimeout self = _e;

if (time(DAY) == TestON) {
	TestSens = 0.72;
	TestingEs = (Es>0)? (Es*TestSens):0;
	TestingIs = (Is>0)? (Is*TestSens):0;
	TestReturn = TestON + TRT;
	TestON = TestON + TestInterval;
} else {
	TestSens = 0;
	TestingEs = 0;
	TestingIs = 0;
};

if (time(DAY) == TestReturn) {
	Rate_DEsDIs = 0;
	Rate_DIsQs = (DIs >0)? DIs:0;
	Rate_DEsQs = (DEs >0)? DEs:0;
} else {
	Rate_DEsDIs = (DEs>0)? (DEs*(1+normal(1,0)/sqrt(DEs))/ExposedTime):0;
	Rate_DIsQs = (DIs>0)? (DIs*pSympS*(1+normal(1,0)/sqrt(DIs))/PresympTime):0;	
	Rate_DEsQs = 0;
}; 



 
;
      return;
    }
    if ( _e == Outflows_Is ) {
      EventTimeout self = _e;

double RAND = (Is>0)? (1 + 10*normal(1,0)/sqrt(Is)) : 0;
RateIsQs = (Is>0)? (0.01*(1-TestSens)*pSympS*Is*RAND/PresympTime)
:0;

RAND = (Is>0)? (1 + 10*normal(1,0)/sqrt(Is)) : 0;
RateIsRs = (Is>0)? 
(0.01*(1-TestSens)*(1-pSympS)*Is*(1-IFRs)*RAND/InfectiousTime):0;

RAND = (Is>0)? (1 + 10*normal(1,0)/sqrt(Is)) : 0;
RateIs = (Is>0)?
(0.01*(1-TestSens)*(1-pSympS)*Is*IFRs*RAND/InfectiousTime) 
: 0; 
;
      return;
    }
    if ( _e == _InfectedResidentsDS_autoUpdateEvent_xjal ) {
      InfectedResidentsDS.update();
      return;
    }
    if ( _e == _autoCreatedDS_xjal ) {
      _ds_ContactRR.update();
      _ds_IP.update();
      _ds_ExposedTime.update();
      _ds_RAND1.update();
      _ds_BetaRR.update();
      _ds_InfectiousTime.update();
      _ds_LeavingRate.update();
      _ds_RAND4.update();
      _ds_ContactSS.update();
      _ds_BetaSS.update();
      _ds_IFR.update();
      _ds_ContactSR.update();
      _ds_BetaSR.update();
      _ds_RAND8.update();
      _ds_RAND9.update();
      _ds_BetaRS.update();
      _ds_ContactRS.update();
      _ds_IFRs.update();
      _ds_CommunityTransmission.update();
      _ds_Turnover.update();
      _ds_pSymp.update();
      _ds_PresympTime.update();
      _ds_IsoTime.update();
      _ds_pSympS.update();
      _ds_RateIsQs.update();
      _ds_RateIsRs.update();
      _ds_RateIs.update();
      _ds_RateIrQr.update();
      _ds_RateIrRr.update();
      _ds_RateIr.update();
      _ds_TestingEs.update();
      _ds_TestSens.update();
      _ds_Rate_DEsQs.update();
      _ds_TestingIs.update();
      _ds_Rate_DIsQs.update();
      _ds_Rate_DEsDIs.update();
      _ds_pInfectedByResidents.update();
      _ds_pInfectedByStaff.update();
      _ds_SDCompliance.update();
      _ds_Nw.update();
      _ds_Flow_ErIr.update();
      _ds_Flow_SrEr.update();
      _ds_Flow_IrRr.update();
      _ds_Outflow_Rr.update();
      _ds_Inflow_Sr.update();
      _ds_Flow_SsEs.update();
      _ds_Flow_EsIs.update();
      _ds_Flow_IsRs.update();
      _ds_Outflow_Ir.update();
      _ds_Outflow_Is.update();
      _ds_Inflow_Ss.update();
      _ds_Outflow_Rs.update();
      _ds_Flow_IrQr.update();
      _ds_Flow_QrRr.update();
      _ds_Outflow_Qr.update();
      _ds_Flow_QsRs.update();
      _ds_Flow_IsQs.update();
      _ds_Outflow_Qs.update();
      _ds_Flow_EsDEs.update();
      _ds_Flow_DEsQs.update();
      _ds_Flow_IsDIs.update();
      _ds_Flow_DIsQs.update();
      _ds_Flow_DEsDIs.update();
      _ds_Transmission_Residents.update();
      _ds_Transmission_Staff.update();
      _ds_Death_Residents.update();
      _ds_flow.update();
      _ds_flow1.update();
      _ds_Sr.update();
      _ds_Er.update();
      _ds_Ir.update();
      _ds_Rr.update();
      _ds_Ss.update();
      _ds_Es.update();
      _ds_Is.update();
      _ds_Rs.update();
      _ds_Qr.update();
      _ds_Qs.update();
      _ds_DEs.update();
      _ds_DIs.update();
      _ds_CumIr.update();
      _ds_CumIs.update();
      _ds_CumDeath.update();
      _ds_TotalS.update();
      _ds_TotalR.update();
      return;
    }
    super.executeActionOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventCondition _e ) {
    if ( _e == OutbreakFirstOccurrence ) return "OutbreakFirstOccurrence";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testConditionOf( EventCondition _e ) {

    if ( _e == OutbreakFirstOccurrence) return 
((Qr + Ir)>=2) && (Outbreak == 0) 
;
    return super.testConditionOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventCondition self ) {
    if ( self == OutbreakFirstOccurrence) {

Outbreak = time(DAY);
main.TotalAffectedHomes++;
main.Outbreak.add(ID, Outbreak);
main.AffectedHomes.add(main.TotalAffectedHomes,0); 
;
      return ;
    }
    super.executeActionOf( self );
  }
  

	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Analysis Data Elements
  /**
   * Auto-created data set(s) for ContactRR
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_ContactRR = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.ContactRR );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for IP
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_IP = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.IP );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for ExposedTime
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_ExposedTime = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.ExposedTime );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RAND1
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RAND1 = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RAND1 );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for BetaRR
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_BetaRR = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.BetaRR );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for InfectiousTime
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_InfectiousTime = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.InfectiousTime );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for LeavingRate
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_LeavingRate = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.LeavingRate );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RAND4
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RAND4 = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RAND4 );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for ContactSS
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_ContactSS = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.ContactSS );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for BetaSS
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_BetaSS = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.BetaSS );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for IFR
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_IFR = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.IFR );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for ContactSR
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_ContactSR = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.ContactSR );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for BetaSR
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_BetaSR = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.BetaSR );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RAND8
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RAND8 = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RAND8 );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RAND9
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RAND9 = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RAND9 );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for BetaRS
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_BetaRS = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.BetaRS );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for ContactRS
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_ContactRS = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.ContactRS );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for IFRs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_IFRs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.IFRs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for CommunityTransmission
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_CommunityTransmission = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.CommunityTransmission );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Turnover
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Turnover = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Turnover );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for pSymp
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_pSymp = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.pSymp );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for PresympTime
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_PresympTime = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.PresympTime );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for IsoTime
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_IsoTime = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.IsoTime );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for pSympS
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_pSympS = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.pSympS );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RateIsQs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RateIsQs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RateIsQs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RateIsRs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RateIsRs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RateIsRs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RateIs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RateIs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RateIs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RateIrQr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RateIrQr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RateIrQr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RateIrRr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RateIrRr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RateIrRr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for RateIr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_RateIr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.RateIr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for TestingEs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_TestingEs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.TestingEs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for TestSens
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_TestSens = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.TestSens );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Rate_DEsQs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Rate_DEsQs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Rate_DEsQs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for TestingIs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_TestingIs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.TestingIs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Rate_DIsQs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Rate_DIsQs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Rate_DIsQs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Rate_DEsDIs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Rate_DEsDIs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Rate_DEsDIs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for pInfectedByResidents
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_pInfectedByResidents = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.pInfectedByResidents );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for pInfectedByStaff
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_pInfectedByStaff = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.pInfectedByStaff );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for SDCompliance
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_SDCompliance = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.SDCompliance );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Nw
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Nw = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Nw );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_ErIr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_ErIr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_ErIr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_SrEr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_SrEr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_SrEr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_IrRr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_IrRr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_IrRr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Outflow_Rr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Outflow_Rr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Outflow_Rr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Inflow_Sr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Inflow_Sr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Inflow_Sr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_SsEs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_SsEs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_SsEs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_EsIs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_EsIs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_EsIs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_IsRs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_IsRs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_IsRs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Outflow_Ir
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Outflow_Ir = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Outflow_Ir );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Outflow_Is
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Outflow_Is = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Outflow_Is );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Inflow_Ss
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Inflow_Ss = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Inflow_Ss );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Outflow_Rs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Outflow_Rs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Outflow_Rs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_IrQr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_IrQr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_IrQr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_QrRr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_QrRr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_QrRr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Outflow_Qr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Outflow_Qr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Outflow_Qr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_QsRs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_QsRs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_QsRs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_IsQs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_IsQs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_IsQs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Outflow_Qs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Outflow_Qs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Outflow_Qs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_EsDEs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_EsDEs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_EsDEs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_DEsQs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_DEsQs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_DEsQs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_IsDIs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_IsDIs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_IsDIs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_DIsQs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_DIsQs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_DIsQs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Flow_DEsDIs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Flow_DEsDIs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Flow_DEsDIs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Transmission_Residents
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Transmission_Residents = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Transmission_Residents );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Transmission_Staff
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Transmission_Staff = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Transmission_Staff );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Death_Residents
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Death_Residents = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Death_Residents );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for flow
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_flow = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.flow );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for flow1
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_flow1 = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.flow1 );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Sr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Sr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Sr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Er
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Er = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Er );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Ir
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Ir = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Ir );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Rr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Rr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Rr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Ss
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Ss = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Ss );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Es
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Es = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Es );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Is
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Is = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Is );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Rs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Rs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Rs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Qr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Qr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Qr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for Qs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_Qs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.Qs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for DEs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_DEs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.DEs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for DIs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_DIs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.DIs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for CumIr
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_CumIr = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.CumIr );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for CumIs
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_CumIs = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.CumIs );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for CumDeath
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_CumDeath = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.CumDeath );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for TotalS
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_TotalS = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.TotalS );
      _lastUpdateTime = time();
    }
  } );
  /**
   * Auto-created data set(s) for TotalR
   */
  @AnyLogicInternalCodegenAPI
  public DataSet _ds_TotalR = new DataSet( 100, new DataUpdater_xjal() {
    double _lastUpdateTime = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateTime ) { return; }
      _d.add( time(), Home.this.TotalR );
      _lastUpdateTime = time();
    }
  } );
  public DataSet InfectedResidentsDS = new DataSet( 365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( _InfectedResidentsDS_XValue(), _InfectedResidentsDS_YValue() );
      _lastUpdateX = time();
    }
  } );

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _InfectedResidentsDS_XValue() {
    return 
Er + Ir + Qr 
;
  }

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _InfectedResidentsDS_YValue() {
    return 
time() 
;
  }
  
  // View areas
  public ViewArea _origin_VA = new ViewArea( this, "[Origin]", 0, 0, 1000.0, 600.0 );
  @Override
  @AnyLogicInternalCodegenAPI
  public int getViewAreas(Map<String, ViewArea> _output) {
    if ( _output != null ) {
      _output.put( "_origin_VA", this._origin_VA );
    }
    return 1 + super.getViewAreas( _output );
  }
  protected static final Color __ps257_Fill_Color = new Color( 0xFF4F8FC8, true );
  protected static final Color __ps258_Fill_Color = new Color( 0xFFA8C5E5, true );
  protected static final Color __ps259_Fill_Color = new Color( 0xFF7CAAD7, true );
  protected static final Color __ps260_Fill_Color = new Color( 0xFFDEEAF5, true );
  protected static final Color __ps261_Line_Color = new Color( 0xFF1F2B3E, true );
  protected static final Color __ps262_Fill_Color = new Color( 0xFF3C5277, true );
  protected static final Color __ps263_Fill_Color = new Color( 0xFF3C5277, true );
  protected static final Color __ps264_Fill_Color = new Color( 0xFF3C5277, true );
  protected static final Color __ps265_Fill_Color = new Color( 0x50000000, true );
  @AnyLogicInternalCodegenAPI
  protected static final int __ps257 = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps258 = 2;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps259 = 3;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps260 = 4;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps261 = 5;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps262 = 6;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps263 = 7;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps264 = 8;
  @AnyLogicInternalCodegenAPI
  protected static final int __ps265 = 9;
  @AnyLogicInternalCodegenAPI
  protected static final int _house = 10;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 11;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps257_pointsDX_xjal() {
    return new double[] { 0.0, 10.0, 10.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps257_pointsDY_xjal() {
    return new double[] { 0.0, -5.0, -11.0, -6.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps257_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps258_pointsDX_xjal() {
    return new double[] { 0.0, 10.0, 5.0, -5.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps258_pointsDY_xjal() {
    return new double[] { 0.0, -5.0, -11.0, -6.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps258_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps259_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 5.0, 10.0, 10.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps259_pointsDY_xjal() {
    return new double[] { 0.0, -6.0, -7.0, -1.0, 5.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps259_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps260_pointsDX_xjal() {
    return new double[] { 0.0, 10.0, 15.0, 5.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps260_pointsDY_xjal() {
    return new double[] { 0.0, -5.0, -6.0, -1.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps260_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps261_pointsDX_xjal() {
    return new double[] { 0.0, 10.0, 10.0, 5.0, 0.0, -10.0, -10.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps261_pointsDY_xjal() {
    return new double[] { 0.0, -5.0, -11.0, -17.0, -16.0, -11.0, -5.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps261_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps262_pointsDX_xjal() {
    return new double[] { 0.0, 2.0, 2.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps262_pointsDY_xjal() {
    return new double[] { 0.0, 1.0, -2.0, -3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps262_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps263_pointsDX_xjal() {
    return new double[] { 0.0, 2.0, 2.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps263_pointsDY_xjal() {
    return new double[] { 0.0, -1.0, -4.0, -3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps263_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps264_pointsDX_xjal() {
    return new double[] { 0.0, 2.0, 2.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps264_pointsDY_xjal() {
    return new double[] { 0.0, 1.0, -2.0, -3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps264_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps265_pointsDX_xjal() {
    return new double[] { 0.0, 4.0, 14.0, 10.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps265_pointsDY_xjal() {
    return new double[] { 0.0, 2.0, -3.0, -5.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] __ps265_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(house);
  }

  protected ShapePolyLine _ps257;
  protected ShapePolyLine _ps258;
  protected ShapePolyLine _ps259;
  protected ShapePolyLine _ps260;
  protected ShapePolyLine _ps261;
  protected ShapePolyLine _ps262;
  protected ShapePolyLine _ps263;
  protected ShapePolyLine _ps264;
  protected ShapePolyLine _ps265;
  protected ShapeGroup house;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    _ps257 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -1.0, 10.0, 0.0, null, __ps257_Fill_Color,
            4, __ps257_pointsDX_xjal(), __ps257_pointsDY_xjal(), __ps257_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps258 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -1.0, 4.0, 0.0, null, __ps258_Fill_Color,
            4, __ps258_pointsDX_xjal(), __ps258_pointsDY_xjal(), __ps258_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps259 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -11.0, 5.0, 0.0, null, __ps259_Fill_Color,
            5, __ps259_pointsDX_xjal(), __ps259_pointsDY_xjal(), __ps259_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps260 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -11.0, -1.0, 0.0, null, __ps260_Fill_Color,
            4, __ps260_pointsDX_xjal(), __ps260_pointsDY_xjal(), __ps260_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps261 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -1.0, 10.0, 0.0, __ps261_Line_Color, null,
            7, __ps261_pointsDX_xjal(), __ps261_pointsDY_xjal(), __ps261_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps262 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -9.0, 4.0, 0.0, null, __ps262_Fill_Color,
            4, __ps262_pointsDX_xjal(), __ps262_pointsDY_xjal(), __ps262_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps263 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, 1.0, 7.0, 0.0, null, __ps263_Fill_Color,
            4, __ps263_pointsDX_xjal(), __ps263_pointsDY_xjal(), __ps263_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps264 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -5.0, 6.0, 0.0, null, __ps264_Fill_Color,
            4, __ps264_pointsDX_xjal(), __ps264_pointsDY_xjal(), __ps264_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

    _ps265 = new ShapePolyLine(
		SHAPE_DRAW_2D, true, -1.0, 10.0, 0.0, null, __ps265_Fill_Color,
            4, __ps265_pointsDX_xjal(), __ps265_pointsDY_xjal(), __ps265_pointsDZ_xjal(), true, 10.0, 1.0, LINE_STYLE_SOLID );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    house = new ShapeGroup( Home.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , _ps257
	     , _ps258
	     , _ps259
	     , _ps260
	     , _ps261
	     , _ps262
	     , _ps263
	     , _ps264
	     , _ps265 );

    }
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBS0_xjal() {
  }


  // Static initialization of persistent elements
  private void instantiatePersistentElements_xjal() {
    level = new com.anylogic.engine.markup.Level(this, "level", SHAPE_DRAW_2D3D, 0.0, true, true);  			
	_getLevels_xjal = new com.anylogic.engine.markup.Level[] { 
      level };
    _createPersistentElementsBP0_xjal();
  }
  protected ShapeTopLevelPresentationGroup presentation;
  protected ShapeModelElementsGroup icon; 

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeTopLevelPresentationGroup getPresentationShape() {
    return presentation;
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public ShapeModelElementsGroup getModelElementsShape() {
    return icon;
  }

	


  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeStep() {
    super.onBeforeStep();
    
//Bank/agency staff Scheduling
double j = Usage;
NShared = (int) poisson(j*Nw);
NShared = NShared + (int) Math.round((Nw-NShared)*Qs/Ns);
NSharedSs = 0;
NSharedIs = 0;
Nu=0;
for (int i=1; i<= NShared; i++) {

	SharedStaff s;
	//choose bank staff who most frequently work at the care home with the probability pRule 
	if (randomTrue(main.pRule)) {
		double max = maxWhere(main.sharedStaffs, 
		p -> p.WorkRecord[ID],
		p -> p.WorkID == 0 && p.Isolation == false
		&& p.GroupID == this.GroupID);
	
		s = randomWhere(main.sharedStaffs,
		p -> p.WorkRecord[ID]== max
		&& p.WorkID == 0 && p.Isolation == false
		&& p.GroupID == this.GroupID);
	} else {
		s = randomWhere(main.sharedStaffs,
		p -> p.WorkID == 0 && p.Isolation == false
		&& p.GroupID == this.GroupID); 
	};
	
	if (s != null) {
		s.WorkID = this.ID;
		if (s.inState(SharedStaff.Infectious)) {
			NSharedIs++;
		};
		
		if (s.inState(SharedStaff.Susceptible)) {
			NSharedSs++;
		};
		
		s.WorkRecord[ID]++;
	} else Nu++;
};
 
  }

  /**
   * Constructor
   */
  public Home( Engine engine, Agent owner, AgentList<? extends Home> ownerPopulation ) {
    super( engine, owner, ownerPopulation );
    instantiateBaseStructureThis_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void onOwnerChanged_xjal() {
    super.onOwnerChanged_xjal();
    setupReferences_xjal();
  }

  @AnyLogicInternalCodegenAPI
  public void instantiateBaseStructure_xjal() {
    super.instantiateBaseStructure_xjal();
    instantiateBaseStructureThis_xjal();
  }
  
  @AnyLogicInternalCodegenAPI
  private void instantiateBaseStructureThis_xjal() {
	instantiatePersistentElements_xjal();
    setupReferences_xjal();
    // Registering in Engine continuous part
    getEngine().registerAgentWithEquations( this );
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
    main = get_Main();
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Home() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Home( int ID, int GroupID, int NSharedSs, int TestInterval, double TRT, double TestON, double TestReturn, int NSharedIs, int NShared, int Nr, int Ns, double Usage, double Nu, double Outbreak ) {
    markParametersAreSet();
    this.ID = ID;
    this.GroupID = GroupID;
    this.NSharedSs = NSharedSs;
    this.TestInterval = TestInterval;
    this.TRT = TRT;
    this.TestON = TestON;
    this.TestReturn = TestReturn;
    this.NSharedIs = NSharedIs;
    this.NShared = NShared;
    this.Nr = Nr;
    this.Ns = Ns;
    this.Usage = Usage;
    this.Nu = Nu;
    this.Outbreak = Outbreak;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating delays
    _Flow_QrRr_formula_0_delay_xjal = new VariableDelay( VariableDelay.Type.EXACT_DELAY, this ) {
      public double getDelayTime() {
        return __Flow_QrRr_formula_0_delay_xjal_DelayTime_xjal();
      }
      @Override
      public double getInput() {
        return __Flow_QrRr_formula_0_delay_xjal_Input_xjal();
      }
      @Override
      public double getInitialValue() {
        return __Flow_QrRr_formula_0_delay_xjal_InitialValue_xjal();
      }
    };
    _Outflow_Qr_formula_0_delay_xjal = new VariableDelay( VariableDelay.Type.EXACT_DELAY, this ) {
      public double getDelayTime() {
        return __Outflow_Qr_formula_0_delay_xjal_DelayTime_xjal();
      }
      @Override
      public double getInput() {
        return __Outflow_Qr_formula_0_delay_xjal_Input_xjal();
      }
      @Override
      public double getInitialValue() {
        return __Outflow_Qr_formula_0_delay_xjal_InitialValue_xjal();
      }
    };
    _Flow_QsRs_formula_0_delay_xjal = new VariableDelay( VariableDelay.Type.EXACT_DELAY, this ) {
      public double getDelayTime() {
        return __Flow_QsRs_formula_0_delay_xjal_DelayTime_xjal();
      }
      @Override
      public double getInput() {
        return __Flow_QsRs_formula_0_delay_xjal_Input_xjal();
      }
    };
    _Outflow_Qs_formula_0_delay_xjal = new VariableDelay( VariableDelay.Type.EXACT_DELAY, this ) {
      public double getDelayTime() {
        return __Outflow_Qs_formula_0_delay_xjal_DelayTime_xjal();
      }
      @Override
      public double getInput() {
        return __Outflow_Qs_formula_0_delay_xjal_Input_xjal();
      }
    };
    // Registering delays
    getEngine().registerDelay( _Flow_QrRr_formula_0_delay_xjal );
    getEngine().registerDelay( _Outflow_Qr_formula_0_delay_xjal );
    getEngine().registerDelay( _Flow_QsRs_formula_0_delay_xjal );
    getEngine().registerDelay( _Outflow_Qs_formula_0_delay_xjal );
    // Assigning initial values for plain variables
    setupPlainVariables_Home_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Home.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( Home.this, getElementProperty( "hybridmodel.Home.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( Home.class );
    // Storing the first samples of delays
    _Flow_QrRr_formula_0_delay_xjal.storeSample();
    _Outflow_Qr_formula_0_delay_xjal.storeSample();
    _Flow_QsRs_formula_0_delay_xjal.storeSample();
    _Outflow_Qs_formula_0_delay_xjal.storeSample();
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    Outflows_Ir.start();
    Staff_Transitions.start();
    Outflows_Is.start();
    _InfectedResidentsDS_autoUpdateEvent_xjal.start();
    _autoCreatedDS_xjal.start();
    OutbreakFirstOccurrence.start();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Home_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Home_xjal() {
  }

  // User API -----------------------------------------------------
  public Main get_Main() {
    {
      Agent owner = getOwner();
      if ( owner instanceof Main ) return (Main) owner;
    }
    return null;
  }

  /**
   * Read-only variable. <em>Shouldn't be modified by user.</em>
   */
  @AnyLogicCustomSerialization(AnyLogicCustomSerializationMode.REFERENCE)
  public transient hybridmodel.Main main;

  @AnyLogicInternalCodegenAPI
  public static LinkToAgentAnimationSettings _connections_commonAnimationSettings_xjal = new LinkToAgentAnimationSettingsImpl( false, black, 1.0, LINE_STYLE_SOLID, ARROW_NONE, 0.0 );

  public LinkToAgentCollection<Agent, Agent> connections = new LinkToAgentStandardImpl<Agent, Agent>(this, _connections_commonAnimationSettings_xjal);
  @Override
  public LinkToAgentCollection<? extends Agent, ? extends Agent> getLinkToAgentStandard_xjal() {
    return connections;
  }


  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends Home> getPopulation() {
    return (AgentList<? extends Home>) super.getPopulation();
  }

  public List<? extends Home> agentsInRange( double distance ) {
    return (List<? extends Home>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _InfectedResidentsDS_autoUpdateEvent_xjal ) return false;
    if ( _e == _autoCreatedDS_xjal ) return false;
    if ( _e == OutbreakFirstOccurrence ) return false;
    return super.isLoggingToDB( _e );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    OutbreakFirstOccurrence.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    Outflows_Ir.onDestroy();
    Staff_Transitions.onDestroy();
    Outflows_Is.onDestroy();
    _InfectedResidentsDS_autoUpdateEvent_xjal.onDestroy();
    _autoCreatedDS_xjal.onDestroy();
    OutbreakFirstOccurrence.onDestroy();
    // Unregistering in Engine continuous part
    getEngine().unregisterAgentWithEquations( this );
    // Unregistering delays
    getEngine().unregisterDelay( _Flow_QrRr_formula_0_delay_xjal );
    getEngine().unregisterDelay( _Outflow_Qr_formula_0_delay_xjal );
    getEngine().unregisterDelay( _Flow_QsRs_formula_0_delay_xjal );
    getEngine().unregisterDelay( _Outflow_Qs_formula_0_delay_xjal );
  // Analysis Data Elements
    _ds_ContactRR.destroyUpdater_xjal();
    _ds_IP.destroyUpdater_xjal();
    _ds_ExposedTime.destroyUpdater_xjal();
    _ds_RAND1.destroyUpdater_xjal();
    _ds_BetaRR.destroyUpdater_xjal();
    _ds_InfectiousTime.destroyUpdater_xjal();
    _ds_LeavingRate.destroyUpdater_xjal();
    _ds_RAND4.destroyUpdater_xjal();
    _ds_ContactSS.destroyUpdater_xjal();
    _ds_BetaSS.destroyUpdater_xjal();
    _ds_IFR.destroyUpdater_xjal();
    _ds_ContactSR.destroyUpdater_xjal();
    _ds_BetaSR.destroyUpdater_xjal();
    _ds_RAND8.destroyUpdater_xjal();
    _ds_RAND9.destroyUpdater_xjal();
    _ds_BetaRS.destroyUpdater_xjal();
    _ds_ContactRS.destroyUpdater_xjal();
    _ds_IFRs.destroyUpdater_xjal();
    _ds_CommunityTransmission.destroyUpdater_xjal();
    _ds_Turnover.destroyUpdater_xjal();
    _ds_pSymp.destroyUpdater_xjal();
    _ds_PresympTime.destroyUpdater_xjal();
    _ds_IsoTime.destroyUpdater_xjal();
    _ds_pSympS.destroyUpdater_xjal();
    _ds_RateIsQs.destroyUpdater_xjal();
    _ds_RateIsRs.destroyUpdater_xjal();
    _ds_RateIs.destroyUpdater_xjal();
    _ds_RateIrQr.destroyUpdater_xjal();
    _ds_RateIrRr.destroyUpdater_xjal();
    _ds_RateIr.destroyUpdater_xjal();
    _ds_TestingEs.destroyUpdater_xjal();
    _ds_TestSens.destroyUpdater_xjal();
    _ds_Rate_DEsQs.destroyUpdater_xjal();
    _ds_TestingIs.destroyUpdater_xjal();
    _ds_Rate_DIsQs.destroyUpdater_xjal();
    _ds_Rate_DEsDIs.destroyUpdater_xjal();
    _ds_pInfectedByResidents.destroyUpdater_xjal();
    _ds_pInfectedByStaff.destroyUpdater_xjal();
    _ds_SDCompliance.destroyUpdater_xjal();
    _ds_Nw.destroyUpdater_xjal();
    _ds_Flow_ErIr.destroyUpdater_xjal();
    _ds_Flow_SrEr.destroyUpdater_xjal();
    _ds_Flow_IrRr.destroyUpdater_xjal();
    _ds_Outflow_Rr.destroyUpdater_xjal();
    _ds_Inflow_Sr.destroyUpdater_xjal();
    _ds_Flow_SsEs.destroyUpdater_xjal();
    _ds_Flow_EsIs.destroyUpdater_xjal();
    _ds_Flow_IsRs.destroyUpdater_xjal();
    _ds_Outflow_Ir.destroyUpdater_xjal();
    _ds_Outflow_Is.destroyUpdater_xjal();
    _ds_Inflow_Ss.destroyUpdater_xjal();
    _ds_Outflow_Rs.destroyUpdater_xjal();
    _ds_Flow_IrQr.destroyUpdater_xjal();
    _ds_Flow_QrRr.destroyUpdater_xjal();
    _ds_Outflow_Qr.destroyUpdater_xjal();
    _ds_Flow_QsRs.destroyUpdater_xjal();
    _ds_Flow_IsQs.destroyUpdater_xjal();
    _ds_Outflow_Qs.destroyUpdater_xjal();
    _ds_Flow_EsDEs.destroyUpdater_xjal();
    _ds_Flow_DEsQs.destroyUpdater_xjal();
    _ds_Flow_IsDIs.destroyUpdater_xjal();
    _ds_Flow_DIsQs.destroyUpdater_xjal();
    _ds_Flow_DEsDIs.destroyUpdater_xjal();
    _ds_Transmission_Residents.destroyUpdater_xjal();
    _ds_Transmission_Staff.destroyUpdater_xjal();
    _ds_Death_Residents.destroyUpdater_xjal();
    _ds_flow.destroyUpdater_xjal();
    _ds_flow1.destroyUpdater_xjal();
    _ds_Sr.destroyUpdater_xjal();
    _ds_Er.destroyUpdater_xjal();
    _ds_Ir.destroyUpdater_xjal();
    _ds_Rr.destroyUpdater_xjal();
    _ds_Ss.destroyUpdater_xjal();
    _ds_Es.destroyUpdater_xjal();
    _ds_Is.destroyUpdater_xjal();
    _ds_Rs.destroyUpdater_xjal();
    _ds_Qr.destroyUpdater_xjal();
    _ds_Qs.destroyUpdater_xjal();
    _ds_DEs.destroyUpdater_xjal();
    _ds_DIs.destroyUpdater_xjal();
    _ds_CumIr.destroyUpdater_xjal();
    _ds_CumIs.destroyUpdater_xjal();
    _ds_CumDeath.destroyUpdater_xjal();
    _ds_TotalS.destroyUpdater_xjal();
    _ds_TotalR.destroyUpdater_xjal();
    InfectedResidentsDS.destroyUpdater_xjal();
    logToDB( InfectedResidentsDS, "InfectedResidentsDS" );
    super.onDestroy();
  }



}
