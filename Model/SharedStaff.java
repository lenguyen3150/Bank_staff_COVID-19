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

public class SharedStaff extends Agent
{
  // Parameters

  /**
   * Indicates whether a bank/agency staff member is self-isolating because of having COVID-19
   */
  public 
boolean  Isolation;

  /**
   * Returns default value for parameter <code>Isolation</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public boolean _Isolation_DefaultValue_xjal() {
    final SharedStaff self = this;
    return 
false 
;
  }

  public void set_Isolation( boolean value ) {
    if (value == this.Isolation) {
      return;
    }
    boolean _oldValue_xjal = this.Isolation;
    this.Isolation = value;
    onChange_Isolation_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Isolation.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Isolation()</code> method instead.
   */
  protected void onChange_Isolation() {
    onChange_Isolation_xjal( Isolation );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Isolation_xjal( boolean oldValue ) {  
  }


  /**
   * The identity of the care home where a bank/agency staff member works
   */
  public 
int  WorkID;

  /**
   * Returns default value for parameter <code>WorkID</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _WorkID_DefaultValue_xjal() {
    final SharedStaff self = this;
    return 
0 
;
  }

  public void set_WorkID( int value ) {
    if (value == this.WorkID) {
      return;
    }
    int _oldValue_xjal = this.WorkID;
    this.WorkID = value;
    onChange_WorkID_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter WorkID.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_WorkID()</code> method instead.
   */
  protected void onChange_WorkID() {
    onChange_WorkID_xjal( WorkID );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_WorkID_xjal( int oldValue ) {  
  }


  /**
   * The identity of the care home bubble to which a bank/agency staff member belongs. The staff member can only work at the care homes with the same GroupID.
   */
  public 
int  GroupID;

  /**
   * Returns default value for parameter <code>GroupID</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _GroupID_DefaultValue_xjal() {
    final SharedStaff self = this;
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


  /**
   * The work record of a bank/agency staff member across care homes<br>
   * i = care homes’ ID<br>
   * WorkRecord [i] = the number of times that the staff member works in care home i
   */
  public 
double[]  WorkRecord;

  /**
   * Returns default value for parameter <code>WorkRecord</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double[] _WorkRecord_DefaultValue_xjal() {
    final SharedStaff self = this;
    return 
new double [main.TotalHomes + 1] 
;
  }

  public void set_WorkRecord( double[] value ) {
    if (value == this.WorkRecord) {
      return;
    }
    double[] _oldValue_xjal = this.WorkRecord;
    this.WorkRecord = value;
    onChange_WorkRecord_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter WorkRecord.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_WorkRecord()</code> method instead.
   */
  protected void onChange_WorkRecord() {
    onChange_WorkRecord_xjal( WorkRecord );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_WorkRecord_xjal( double[] oldValue ) {  
  }


  /**
   * Indicates whether a bank/agency staff member has a positive RT-PCR test in the last 7 days
   */
  public 
boolean  Detected;

  /**
   * Returns default value for parameter <code>Detected</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public boolean _Detected_DefaultValue_xjal() {
    final SharedStaff self = this;
    return 
false 
;
  }

  public void set_Detected( boolean value ) {
    if (value == this.Detected) {
      return;
    }
    boolean _oldValue_xjal = this.Detected;
    this.Detected = value;
    onChange_Detected_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Detected.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Detected()</code> method instead.
   */
  protected void onChange_Detected() {
    onChange_Detected_xjal( Detected );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Detected_xjal( boolean oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    Isolation = _Isolation_DefaultValue_xjal();
    WorkID = _WorkID_DefaultValue_xjal();
    GroupID = _GroupID_DefaultValue_xjal();
    WorkRecord = _WorkRecord_DefaultValue_xjal();
    Detected = _Detected_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "Isolation":
      if ( _callOnChange_xjal ) {
        set_Isolation( (Boolean) _value_xjal );
      } else {
        Isolation = (Boolean) _value_xjal;
      }
      return true;
    case "WorkID":
      if ( _callOnChange_xjal ) {
        set_WorkID( ((Number) _value_xjal).intValue() );
      } else {
        WorkID = ((Number) _value_xjal).intValue();
      }
      return true;
    case "GroupID":
      if ( _callOnChange_xjal ) {
        set_GroupID( ((Number) _value_xjal).intValue() );
      } else {
        GroupID = ((Number) _value_xjal).intValue();
      }
      return true;
    case "WorkRecord":
      if ( _callOnChange_xjal ) {
        set_WorkRecord( (double[]) _value_xjal );
      } else {
        WorkRecord = (double[]) _value_xjal;
      }
      return true;
    case "Detected":
      if ( _callOnChange_xjal ) {
        set_Detected( (Boolean) _value_xjal );
      } else {
        Detected = (Boolean) _value_xjal;
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
    case "Isolation": _result_xjal = Isolation; break;
    case "WorkID": _result_xjal = WorkID; break;
    case "GroupID": _result_xjal = GroupID; break;
    case "WorkRecord": _result_xjal = WorkRecord; break;
    case "Detected": _result_xjal = Detected; break;
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
      list.add( "Isolation" );
      list.add( "WorkID" );
      list.add( "GroupID" );
      list.add( "WorkRecord" );
      list.add( "Detected" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( SharedStaff.class );
  
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



	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 1;


  // Statecharts
  public Statechart<InfectionState_state> InfectionState = new Statechart<>( this, (short)2 );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( Statechart _s ) {
    if(_s == this.InfectionState) return "InfectionState";
    return super.getNameOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public int getIdOf( Statechart _s ) {
    if(_s == this.InfectionState) return 0;
    return super.getIdOf( _s );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( Statechart _s ) {
    if( _s == this.InfectionState ) {
      enterState( Susceptible, true );
      return;
    }
    super.executeActionOf( _s );
  }

   // States of all statecharts
   
  public enum InfectionState_state implements IStatechartState<SharedStaff, InfectionState_state> {
    Susceptible,
    Exposed,
    Infectious,
    Recovered,
    PreSymp() {
      @Override
      @AnyLogicInternalCodegenAPI
      public InfectionState_state getContainerState() {
        return Infectious;
      }
	},
    Symp() {
      @Override
      @AnyLogicInternalCodegenAPI
      public InfectionState_state getContainerState() {
        return Infectious;
      }
	},
    ASymp() {
      @Override
      @AnyLogicInternalCodegenAPI
      public InfectionState_state getContainerState() {
        return Infectious;
      }
	},
    branch,
    branch1() {
      @Override
      @AnyLogicInternalCodegenAPI
      public InfectionState_state getContainerState() {
        return Infectious;
      }
	};

    @AnyLogicInternalCodegenAPI
    private Collection<InfectionState_state> _simpleStatesDeep_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<InfectionState_state> _fullState_xjal;

    @AnyLogicInternalCodegenAPI
    private Set<InfectionState_state> _statesInside_xjal;

    @Override
    @AnyLogicInternalCodegenAPI
    public Collection<InfectionState_state> getSimpleStatesDeep() {
      Collection<InfectionState_state> result = _simpleStatesDeep_xjal;
      if (result == null) {
        _simpleStatesDeep_xjal = result = calculateAllSimpleStatesDeep();
      }
      return result;
    }
    
    @Override
    public Set<InfectionState_state> getFullState() {
      Set<InfectionState_state> result = _fullState_xjal;
      if (result == null) {
        _fullState_xjal = result = calculateFullState();
      }
      return result;
    }
    
    @Override
    @AnyLogicInternalCodegenAPI
    public Set<InfectionState_state> getStatesInside() {
      Set<InfectionState_state> result = _statesInside_xjal;
      if (result == null) {
        _statesInside_xjal = result = calculateStatesInside();
      }
      return result;
    }

    @Override
    @AnyLogicInternalCodegenAPI
    public Statechart<InfectionState_state> getStatechart( SharedStaff _a ) {
      return _a.InfectionState;
    }
  }
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionState_state Susceptible = InfectionState_state.Susceptible;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionState_state Exposed = InfectionState_state.Exposed;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionState_state Infectious = InfectionState_state.Infectious;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionState_state Recovered = InfectionState_state.Recovered;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionState_state PreSymp = InfectionState_state.PreSymp;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionState_state Symp = InfectionState_state.Symp;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionState_state ASymp = InfectionState_state.ASymp;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionState_state branch = InfectionState_state.branch;
  @AnyLogicCustomProposalPriority(type = AnyLogicCustomProposalPriority.Type.STATIC_ELEMENT)
  public static final InfectionState_state branch1 = InfectionState_state.branch1;


  @AnyLogicInternalCodegenAPI
  private void enterState( InfectionState_state self, boolean _destination ) {
    switch( self ) {
      case Susceptible:
  	    logToDBEnterState(InfectionState, self);
        // (Simple state (not composite))
        InfectionState.setActiveState_xjal( Susceptible );
        {
shapeBody.setFillColor(yellowGreen);
this.Isolation = false;
this.Detected = false; 
;}
        transition1.start();
        Community_Transmission.start();
        return;
      case Exposed:
  	    logToDBEnterState(InfectionState, self);
        // (Simple state (not composite))
        InfectionState.setActiveState_xjal( Exposed );
        {
shapeBody.setFillColor(gold);
main.CumInfectedBankStaff++; 
;}
        transition.start();
        return;
      case Infectious:
  	    logToDBEnterState(InfectionState, self);
        // (Composite state)
        {
shapeBody.setFillColor(red);
 
;}
        transition11.start();
        if ( _destination ) {
           enterState( branch1, true );
        }
        return;
      case Recovered:
  	    logToDBEnterState(InfectionState, self);
        // (Simple state (not composite))
        InfectionState.setActiveState_xjal( Recovered );
        {
shapeBody.setFillColor(green);
this.Isolation = false;
this.Detected = false 
;}
        transition5.start();
        return;
      case PreSymp:
  	    logToDBEnterState(InfectionState, self);
        // (Simple state (not composite))
        InfectionState.setActiveState_xjal( PreSymp );
        transition4.start();
        return;
      case Symp:
  	    logToDBEnterState(InfectionState, self);
        // (Simple state (not composite))
        InfectionState.setActiveState_xjal( Symp );
        {
Isolation = true; 
;}
        return;
      case ASymp:
  	    logToDBEnterState(InfectionState, self);
        // (Simple state (not composite))
        InfectionState.setActiveState_xjal( ASymp );
        return;
      case branch:
  	    logToDBEnterState(InfectionState, self);
        // (Branch)
        if ( 
randomTrue(main.IFRStaff()) 
 ) { // transition7
          {
for (int i = 1; i<=main.TotalHomes; i++) {
	WorkRecord[i] = 0;
} 
;}
          enterState( Susceptible, true );
          return;
        }
        // transition6 (default)
          enterState( Recovered, true );
        return;
      case branch1:
  	    logToDBEnterState(InfectionState, self);
        // (Branch)
        if ( 
randomTrue(main.pStaffSymp) 
 ) { // transition2
          enterState( PreSymp, true );
          return;
        }
        // transition3 (default)
          enterState( ASymp, true );
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitState( InfectionState_state self, Transition _t, boolean _source ) {
    switch( self ) {
      case Susceptible: 
  	    logToDBExitState(InfectionState, self);
  	    logToDB(InfectionState, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition1) transition1.cancel();
        if ( !_source || _t != Community_Transmission) Community_Transmission.cancel();
        return;
      case Exposed: 
  	    logToDBExitState(InfectionState, self);
  	    logToDB(InfectionState, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition) transition.cancel();
        return;
      case Infectious: 
  	    logToDBExitState(InfectionState, self);
  	    logToDB(InfectionState, _t, self);
      // (Composite state)
        if ( _source ) exitInnerStates(self);
        if ( !_source || _t != transition11 ) transition11.cancel();
        return;
      case Recovered: 
  	    logToDBExitState(InfectionState, self);
  	    logToDB(InfectionState, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition5) transition5.cancel();
        return;
      case PreSymp: 
  	    logToDBExitState(InfectionState, self);
  	    logToDB(InfectionState, _t, self);
      // (Simple state (not composite))
        if ( !_source || _t != transition4) transition4.cancel();
        return;
      case Symp: 
  	    logToDBExitState(InfectionState, self);
  	    logToDB(InfectionState, _t, self);
      // (Simple state (not composite))
        return;
      case ASymp: 
  	    logToDBExitState(InfectionState, self);
  	    logToDB(InfectionState, _t, self);
      // (Simple state (not composite))
        return;
      default:
        return;
    }
  }

  @AnyLogicInternalCodegenAPI
  private void exitInnerStates( InfectionState_state _destination ) {
    InfectionState_state _state = InfectionState.getActiveSimpleState();
    while( _state != _destination ) {
			exitState( _state, null, false );
			_state = _state.getContainerState();
		}
	}
  
  public TransitionTimeout transition = new TransitionTimeout( this );
  public TransitionTimeout transition11 = new TransitionTimeout( this );
  public TransitionTimeout transition4 = new TransitionTimeout( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionTimeout _t ) {
    if ( _t == transition ) return "transition";
    if ( _t == transition11 ) return "transition11";
    if ( _t == transition4 ) return "transition4";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionTimeout _t ) { 
    if ( _t == transition ) return InfectionState;
    if ( _t == transition11 ) return InfectionState;
    if ( _t == transition4 ) return InfectionState;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionTimeout self ) {
    if ( self == transition ) {
      exitState( Exposed, self, true );
          enterState( Infectious, true );
      return;
    }
    if ( self == transition11 ) {
      exitState( Infectious, self, true );
          enterState( branch, true );
      return;
    }
    if ( self == transition4 ) {
      exitState( PreSymp, self, true );
          enterState( Symp, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( TransitionTimeout _t ) {
    double _value;
    if ( _t == transition ) {
      _value = 
main.ExposedTime() 
;
      _value = toModelTime( _value, DAY );
      return _value;
    }
    if ( _t == transition11 ) {
      _value = 
main.Infectiousness() 
;
      _value = toModelTime( _value, DAY );
      return _value;
    }
    if ( _t == transition4 ) {
      _value = 
main.PresymptomaticTime() 
;
      _value = toModelTime( _value, DAY );
      return _value;
    }
    return super.evaluateTimeoutOf( _t );
  }


  public TransitionRate transition5 = new TransitionRate( this );
  public TransitionRate Community_Transmission = new TransitionRate( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionRate _t ) {
    if ( _t == transition5 ) return "transition5";
    if ( _t == Community_Transmission ) return "Community_Transmission";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionRate _t ) { 
    if ( _t == transition5 ) return InfectionState;
    if ( _t == Community_Transmission ) return InfectionState;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionRate self ) {
    if ( self == transition5 ) {
      exitState( Recovered, self, true );
      {
for (int i = 1; i<=main.TotalHomes; i++) {
	WorkRecord[i] = 0;
}
main.TotalBankStaff++; 
;}
          enterState( Susceptible, true );
      return;
    }
    if ( self == Community_Transmission ) {
      exitState( Susceptible, self, true );
          enterState( Exposed, true );
      return;
    }
    super.executeActionOf( self );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateRateOf( TransitionRate _t ) {
    double _value;
    if ( _t == transition5 ) {
      _value = 
main.Turnover 
;
      _value = toModelRate( _value, PER_YEAR );
      return _value;
    }
    if ( _t == Community_Transmission ) {
      _value = 
main.CommunityTransmission 
;
      _value = toModelRate( _value, PER_DAY );
      return _value;
    }
    return super.evaluateRateOf( _t );
  }

  public TransitionMessage transition1 = new TransitionMessage( this );

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( TransitionMessage _t ) {
    if ( _t == transition1 ) return "transition1";
    return super.getNameOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public Statechart getStatechartOf( TransitionMessage _t ) { 
    if ( _t == transition1 ) return InfectionState;
    return super.getStatechartOf( _t );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( TransitionMessage self, Object _msg ) {
    if ( self == transition1 ) {
      exitState( Susceptible, self, true );
          enterState( Exposed, true );
      return;
    }
    super.executeActionOf( self, _msg );
  }
  @Override
  @AnyLogicInternalCodegenAPI
  public boolean testMessageOf( TransitionMessage _t, Object _msg ) {
    if ( _t == transition1 ) {
      
Object 
msg = (Object) _msg;
      Object _g = 
"Infect" 
;
      return msg.equals( _g );
    }
    return super.testMessageOf( _t, _msg );
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
  @AnyLogicInternalCodegenAPI
  protected static final int _shapeBody = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _person = 2;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 3;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return true;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDX_xjal() {
    return new double[] { 0.0, 0.0, 3.0, -1.0, -2.0, -2.0, -2.0, 0.0, -1.0, 0.0, 1.0, 3.0, 4.0, 5.0, 4.0, 6.0, 6.0, 6.0, 5.0, 1.0, 4.0, 4.0, 4.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDY_xjal() {
    return new double[] { 0.0, 4.0, 2.0, 3.0, 3.0, 10.0, 11.0, 11.0, 9.0, 17.0, 17.0, 17.0, 17.0, 9.0, 11.0, 11.0, 10.0, 3.0, 3.0, 2.0, 4.0, 0.0, -3.0, -3.0,  };
  }
  @AnyLogicInternalCodegenAPI
  protected static final double[] _shapeBody_pointsDZ_xjal() {
    return new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,  };
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll(person);
  }

  protected ShapeCurve shapeBody;
  protected ShapeGroup person;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
    shapeBody = new ShapeCurve(
      true,-2.0, -7.0, 
      null, black,
      24, true, _shapeBody_pointsDX_xjal(), _shapeBody_pointsDY_xjal(),
 	true, 1.0, LINE_STYLE_SOLID    );

  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    {				
    person = new ShapeGroup( SharedStaff.this, SHAPE_DRAW_2D, true, 0.0, 0.0, 0.0, 0.0
	
	     , shapeBody );

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

	


  /**
   * Constructor
   */
  public SharedStaff( Engine engine, Agent owner, AgentList<? extends SharedStaff> ownerPopulation ) {
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
  }
  
  @AnyLogicInternalCodegenAPI
  private void setupReferences_xjal() {
    main = get_Main();
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public SharedStaff() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public SharedStaff( boolean Isolation, int WorkID, int GroupID, double[] WorkRecord, boolean Detected ) {
    markParametersAreSet();
    this.Isolation = Isolation;
    this.WorkID = WorkID;
    this.GroupID = GroupID;
    this.WorkRecord = WorkRecord;
    this.Detected = Detected;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Assigning initial values for plain variables
    setupPlainVariables_SharedStaff_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( SharedStaff.this, true, 0, 0, 0, 0 , level );
    icon = new ShapeModelElementsGroup( SharedStaff.this, getElementProperty( "hybridmodel.SharedStaff.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    setupInitialConditions_xjal( SharedStaff.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    InfectionState.start();
  }
 

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_SharedStaff_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_SharedStaff_xjal() {
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
  @Override
  @AnyLogicInternalCodegenAPI
  public void onReceive( Object _msg_xjal, Agent _sender_xjal ) {
    super.onReceive( _msg_xjal, _sender_xjal );
    InfectionState.fireEvent( _msg_xjal );
  }



  @AnyLogicInternalCodegenAPI
  public void drawLinksToAgents(boolean _underAgents_xjal, LinkToAgentAnimator _animator_xjal) {
    super.drawLinksToAgents(_underAgents_xjal, _animator_xjal);
    if ( _underAgents_xjal ) {
      _animator_xjal.drawLink( this, connections, true, true );
    }
  }

  public AgentList<? extends SharedStaff> getPopulation() {
    return (AgentList<? extends SharedStaff>) super.getPopulation();
  }

  public List<? extends SharedStaff> agentsInRange( double distance ) {
    return (List<? extends SharedStaff>) super.agentsInRange( distance );
  }

  // Reaction on changes -------------------------------------
  public void onChange() {
    super.onChange();
    InfectionState.onChange();
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    InfectionState.onDestroy();
    super.onDestroy();
  }



}
