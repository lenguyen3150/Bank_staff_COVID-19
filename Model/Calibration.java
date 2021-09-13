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


import com.opttek.optquest.*;



public class Calibration extends ExperimentOptimization<Main> {
  @AnyLogicInternalCodegenAPI
  public static String[] COMMAND_LINE_ARGUMENTS_xjal = new String[0];
  {
    setCommandLineArguments_xjal( COMMAND_LINE_ARGUMENTS_xjal );
  }
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Calibration.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  // Plain Variables
  public 
double 
 bestShape1 = 
0 ;
  public 
double 
 bestShape2 = 
0 ;
  public 
double 
 bestDistMean = 
0 ;

  // Table Functions


  /**
   * InfectiousHistoric Table Function
   */
  public TableFunction InfectiousHistoric;
  
  public final double InfectiousHistoric( double x ) { return InfectiousHistoric.get( x ); }
  // Analysis Data Elements
  public DataSet dsInfectiousHistoric = new DataSet( 185 );
  
  public DataSet dsInfectiousCurrent = new DataSet( 185 );
  
  public DataSet dsInfectiousBest = new DataSet( 185 );
  
  // View areas
  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 1;


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

  {
	if (InfectiousHistoric == null) {
		InfectiousHistoric = new TableElementDatabaseBuilder(this).setSqlQuery("SELECT time, prev FROM baseline").buildTableFunction( 
    		TableFunction.INTERPOLATION_LINEAR, 1, TableFunction.OUTOFRANGE_ERROR,
    		0.0 );
    }
  }

  @Override
  public int getWindowWidth() {
    return 1000;
  }

  @Override
  public int getWindowHeight() {
    return 600;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onDestroy_xjal() {
  // Analysis Data Elements
    dsInfectiousHistoric.destroyUpdater_xjal();
    dsInfectiousCurrent.destroyUpdater_xjal();
    dsInfectiousBest.destroyUpdater_xjal();
    logToDB( dsInfectiousCurrent, "dsInfectiousCurrent" );
    logToDB( dsInfectiousBest, "dsInfectiousBest" );
    super.onDestroy_xjal();
  }


  @Override
  @AnyLogicInternalCodegenAPI
  public void initDefaultRandomNumberGenerator(Engine _e) {
    _e.setDefaultRandomGenerator( new java.util.Random() );
  }

  // Parameter values (read-only)
  public int TotalHomes;
  public int k;
  public int j;
  public int p;
  public double ContactRR;
  public double ContactRS;
  public double ContactSS;
  public double pStaffSymp;
  public double CommunityTransmission;
  public int IsolationTime;
  public int TotalSharedStaff;
  public int NBubbles;
  public int TotalAffectedHomes;
  public double Usage;
  public double PCRSens;
  public int TestInterval;
  public int TRT;
  public double LFTSens;
  public int t;
  public double Turnover;
  public double Adjusted;
  public double pRule;
  public double PCRCompliance;
  public double shape1;
  public double mean;

  // Optimization-specific fields

  // Decision variables
  public COptQuestContinuousVariable _oqvar_IP = new COptQuestContinuousVariable();
  public COptQuestDiscreteVariable _oqvar_shape1 = new COptQuestDiscreteVariable();
  public COptQuestContinuousVariable _oqvar_mean = new COptQuestContinuousVariable();

  /**
   * Engine setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupEngine(Engine engine) {
    engine.setATOL( 1.0E-5 );
    engine.setRTOL( 1.0E-5 );
    engine.setTTOL( 1.0E-5 );
    engine.setHTOL( 0.01 );
    engine.setSolverODE( Engine.SOLVER_ODE_EULER );
    engine.setSolverNAE( Engine.SOLVER_NAE_MODIFIED_NEWTON );
    engine.setSolverDAE( Engine.SOLVER_DAE_RK45_NEWTON );
    engine.setVMethods( 427029 );
    engine.setSimultaneousEventsSelectionMode( Engine.EVENT_SELECTION_LIFO );

    engine.setStartTime( 0.0 );
    engine.setTimeUnit( DAY );
    engine.setStartDate( toDate( 2020, NOVEMBER, 12, 0, 0, 0 ) );
    engine.setStopTime( 180.0 );
  }

  /**
   * Experiment setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setup( IExperimentHost _e ) {
    setName( "HybridModel_Calibration : Optimization" );

    // Static initialization of persistent elements

    // Dynamic initialization of persistent elements
    presentation = new ShapeTopLevelPresentationGroup( Calibration.this, true, 0, 0, 0, 0  );
    // Dynamic initialization of persistent elements
    icon = new ShapeModelElementsGroup( Calibration.this, getElementProperty( "hybridmodel.Calibration.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    _e.setZoomAndPanningEnabled( true );
    _e.setDeveloperPanelEnabled( true );
    _e.setDeveloperPanelVisibleOnStart( false );
    
dsInfectiousHistoric.fillFrom( InfectiousHistoric ); 
  }
  
  // Objective evaluation
  
  @Override
  @AnyLogicInternalCodegenAPI
  public Main createRoot( Engine engine ) {
    // Create the root object
    return new Main( engine, null, null );
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupRootParameters( final Main self, boolean callOnChangeActions ) {
    final Main root = self; // for compatibility
    // Set fixed root parameter values
    int TotalHomes_xjal;
    TotalHomes_xjal = self._TotalHomes_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_TotalHomes( TotalHomes_xjal );
    } else {
      self.TotalHomes = TotalHomes_xjal;
    }
    int k_xjal;
    k_xjal = self._k_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_k( k_xjal );
    } else {
      self.k = k_xjal;
    }
    int j_xjal;
    j_xjal = self._j_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_j( j_xjal );
    } else {
      self.j = j_xjal;
    }
    int p_xjal;
    p_xjal = self._p_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_p( p_xjal );
    } else {
      self.p = p_xjal;
    }
    double ContactRR_xjal;
    ContactRR_xjal = self._ContactRR_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_ContactRR( ContactRR_xjal );
    } else {
      self.ContactRR = ContactRR_xjal;
    }
    double ContactRS_xjal;
    ContactRS_xjal = self._ContactRS_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_ContactRS( ContactRS_xjal );
    } else {
      self.ContactRS = ContactRS_xjal;
    }
    double ContactSS_xjal;
    ContactSS_xjal = self._ContactSS_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_ContactSS( ContactSS_xjal );
    } else {
      self.ContactSS = ContactSS_xjal;
    }
    double pStaffSymp_xjal;
    pStaffSymp_xjal = self._pStaffSymp_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_pStaffSymp( pStaffSymp_xjal );
    } else {
      self.pStaffSymp = pStaffSymp_xjal;
    }
    double CommunityTransmission_xjal;
    CommunityTransmission_xjal = self._CommunityTransmission_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_CommunityTransmission( CommunityTransmission_xjal );
    } else {
      self.CommunityTransmission = CommunityTransmission_xjal;
    }
    int IsolationTime_xjal;
    IsolationTime_xjal = self._IsolationTime_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_IsolationTime( IsolationTime_xjal );
    } else {
      self.IsolationTime = IsolationTime_xjal;
    }
    int TotalSharedStaff_xjal;
    TotalSharedStaff_xjal = self._TotalSharedStaff_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_TotalSharedStaff( TotalSharedStaff_xjal );
    } else {
      self.TotalSharedStaff = TotalSharedStaff_xjal;
    }
    int NBubbles_xjal;
    NBubbles_xjal = self._NBubbles_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_NBubbles( NBubbles_xjal );
    } else {
      self.NBubbles = NBubbles_xjal;
    }
    int TotalAffectedHomes_xjal;
    TotalAffectedHomes_xjal = self._TotalAffectedHomes_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_TotalAffectedHomes( TotalAffectedHomes_xjal );
    } else {
      self.TotalAffectedHomes = TotalAffectedHomes_xjal;
    }
    double Usage_xjal;
    Usage_xjal = self._Usage_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Usage( Usage_xjal );
    } else {
      self.Usage = Usage_xjal;
    }
    double PCRSens_xjal;
    PCRSens_xjal = self._PCRSens_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_PCRSens( PCRSens_xjal );
    } else {
      self.PCRSens = PCRSens_xjal;
    }
    int TestInterval_xjal;
    TestInterval_xjal = self._TestInterval_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_TestInterval( TestInterval_xjal );
    } else {
      self.TestInterval = TestInterval_xjal;
    }
    int TRT_xjal;
    TRT_xjal = self._TRT_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_TRT( TRT_xjal );
    } else {
      self.TRT = TRT_xjal;
    }
    double LFTSens_xjal;
    LFTSens_xjal = self._LFTSens_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_LFTSens( LFTSens_xjal );
    } else {
      self.LFTSens = LFTSens_xjal;
    }
    int t_xjal;
    t_xjal = self._t_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_t( t_xjal );
    } else {
      self.t = t_xjal;
    }
    double Turnover_xjal;
    Turnover_xjal = self._Turnover_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Turnover( Turnover_xjal );
    } else {
      self.Turnover = Turnover_xjal;
    }
    double Adjusted_xjal;
    Adjusted_xjal = self._Adjusted_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_Adjusted( Adjusted_xjal );
    } else {
      self.Adjusted = Adjusted_xjal;
    }
    double pRule_xjal;
    pRule_xjal = self._pRule_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_pRule( pRule_xjal );
    } else {
      self.pRule = pRule_xjal;
    }
    double PCRCompliance_xjal;
    PCRCompliance_xjal = 0
;
    if (callOnChangeActions) {
      self.set_PCRCompliance( PCRCompliance_xjal );
    } else {
      self.PCRCompliance = PCRCompliance_xjal;
    }
    // Set root parameters from optimizer
    double shape1_xjal = getCurrentParamValue( _oqvar_shape1 );
    if (callOnChangeActions) {
      self.set_shape1( shape1_xjal );
    } else {
      self.shape1 = shape1_xjal;
    }
    double mean_xjal = getCurrentParamValue( _oqvar_mean );
    if (callOnChangeActions) {
      self.set_mean( mean_xjal );
    } else {
      self.mean = mean_xjal;
    }
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeSimulationRun( Main root ) {
    TotalHomes = root.TotalHomes;
    k = root.k;
    j = root.j;
    p = root.p;
    ContactRR = root.ContactRR;
    ContactRS = root.ContactRS;
    ContactSS = root.ContactSS;
    pStaffSymp = root.pStaffSymp;
    CommunityTransmission = root.CommunityTransmission;
    IsolationTime = root.IsolationTime;
    TotalSharedStaff = root.TotalSharedStaff;
    NBubbles = root.NBubbles;
    TotalAffectedHomes = root.TotalAffectedHomes;
    Usage = root.Usage;
    PCRSens = root.PCRSens;
    TestInterval = root.TestInterval;
    TRT = root.TRT;
    LFTSens = root.LFTSens;
    t = root.t;
    Turnover = root.Turnover;
    Adjusted = root.Adjusted;
    pRule = root.pRule;
    PCRCompliance = root.PCRCompliance;
    shape1 = root.shape1;
    mean = root.mean;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onEngineFinished() {
    final Main root = (Main) getEngine().getRoot();
    // After simulation run code
    
dsInfectiousCurrent.fillFrom( root.Prevalence ); 


    // Set objective value to simulation output
    setCurrentObjectiveValue( 
difference( dsInfectiousCurrent, dsInfectiousHistoric ) 
);
    
  }
  

  @Override
  @AnyLogicInternalCodegenAPI
  public void onAfterIteration() {

    // After iteration code
        
if( getCurrentIteration() == getBestIteration() ) {
   dsInfectiousBest.fillFrom( dsInfectiousCurrent );
   bestShape1 = getBestParamValue(_oqvar_shape1);
   bestDistMean = getBestParamValue(_oqvar_mean);
   bestShape2 = bestShape1*(1/bestDistMean - 1);
};
 
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void reset() {
    
    setObjectiveMinimize();

      // Stop conditions setup
    setMaximumIterations( 500 );
    setAutoStop( false );

    // Decision variables
    double _value; 
    _value = 0.005
;
    setParameterVariableLowerBound( _oqvar_IP, _value);
    _value = 0.05
;
    setParameterVariableUpperBound( _oqvar_IP, _value);
    setParameterVariableName( _oqvar_IP, "IP" );
    addParameterVariable( _oqvar_IP );
    _value = 1
;
    setParameterVariableStepSize(_oqvar_shape1, _value);
    _value = 1
;
    setParameterVariableLowerBound( _oqvar_shape1, _value);
    _value = 10
;
    setParameterVariableUpperBound( _oqvar_shape1, _value);
    setParameterVariableName( _oqvar_shape1, "shape1" );
    addParameterVariable( _oqvar_shape1 );
    _value = 0.005
;
    setParameterVariableLowerBound( _oqvar_mean, _value);
    _value = 0.035
;
    setParameterVariableUpperBound( _oqvar_mean, _value);
    setParameterVariableName( _oqvar_mean, "mean" );
    addParameterVariable( _oqvar_mean );


      // Replications setup
    setUseReplications( true );
    setFixedReplicationsNumber( 500 );
  }
}
