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




public class ParameterVariation extends ExperimentParamVariation<Main> {
  @AnyLogicInternalCodegenAPI
  public static String[] COMMAND_LINE_ARGUMENTS_xjal = new String[0];
  {
    setCommandLineArguments_xjal( COMMAND_LINE_ARGUMENTS_xjal );
  }
  // Excel Files
  public ExcelFile excelOutput = new ExcelFile( ParameterVariation.this, "/hybridmodel/", "/Users/lknnguyen/Desktop/NHSL/HybridModel/excelOutput_260521.xlsx", false );

  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( ParameterVariation.class );
  
  @AnyLogicInternalCodegenAPI
  @Override
  public Map<String, IElementDescriptor> getElementDesciptors() {
    return elementDesciptors_xjal;
  }
  // Plain Variables
  public 
int 
 i = 
2 ;
  public 
int 
 ii = 
1 ;

  // Analysis Data Elements
  public DataSet Ir90 = new DataSet( 100000 );
  
  public DataSet Ir180 = new DataSet( 100000 );
  
  public DataSet Nr90 = new DataSet( 100000 );
  
  public DataSet Nr180 = new DataSet( 100000 );
  
  public DataSet Is90 = new DataSet( 100000 );
  
  public DataSet Is180 = new DataSet( 100000 );
  
  public DataSet Ns90 = new DataSet( 100000 );
  
  public DataSet Ns180 = new DataSet( 100000 );
  
  public DataSet IShared90 = new DataSet( 100000 );
  
  public DataSet IShared180 = new DataSet( 100000 );
  
  public DataSet NShared90 = new DataSet( 100000 );
  
  public DataSet NShared180 = new DataSet( 100000 );
  
  public DataSet Death = new DataSet( 100000 );
  
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
    // Destroy database objects
    excelOutput.writeFile();
  // Analysis Data Elements
    Ir90.destroyUpdater_xjal();
    Ir180.destroyUpdater_xjal();
    Nr90.destroyUpdater_xjal();
    Nr180.destroyUpdater_xjal();
    Is90.destroyUpdater_xjal();
    Is180.destroyUpdater_xjal();
    Ns90.destroyUpdater_xjal();
    Ns180.destroyUpdater_xjal();
    IShared90.destroyUpdater_xjal();
    IShared180.destroyUpdater_xjal();
    NShared90.destroyUpdater_xjal();
    NShared180.destroyUpdater_xjal();
    Death.destroyUpdater_xjal();
    logToDB( Ir180, "Ir180" );
    logToDB( Nr180, "Nr180" );
    logToDB( Is180, "Is180" );
    logToDB( Ns180, "Ns180" );
    logToDB( IShared180, "IShared180" );
    logToDB( NShared180, "NShared180" );
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
    engine.setStopTime( 272.0 );
  }

  /**
   * Experiment setup
   */
  @Override
  @AnyLogicInternalCodegenAPI
  public void setup( IExperimentHost _e ) {
    setName( "HybridModel_Feb 1 : ParameterVariation" );

    // Static initialization of persistent elements

    excelOutput.readFile();


    // Dynamic initialization of persistent elements
    presentation = new ShapeTopLevelPresentationGroup( ParameterVariation.this, true, 0, 0, 0, 0  );
    // Dynamic initialization of persistent elements
    icon = new ShapeModelElementsGroup( ParameterVariation.this, getElementProperty( "hybridmodel.ParameterVariation.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    _e.setZoomAndPanningEnabled( true );
    _e.setDeveloperPanelEnabled( true );
    _e.setDeveloperPanelVisibleOnStart( false );
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public Main createRoot( Engine engine ) {
    // Create the root object
    return new Main( engine, null, null );
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onBeforeSimulationRun(Main root) {
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
    
Ir90.add(root.CumInfectedResidents.getY(90), root.TotalResidents.getY(90));
Ir180.add(root.CumInfectedResidents.getY(180), root.TotalResidents.getY(180));
Death.add(root.CumDeaths.getY(90), root.CumDeaths.getY(180));
Is90.add(root.CumInfectedStaff.getY(90), root.TotalStaff.getY(90));
Is180.add(root.CumInfectedStaff.getY(180), root.TotalStaff.getY(180));
IShared90.add(root.InfectedBankStaff.getY(90), root.TotalStaffBank.getY(90));
IShared180.add(root.InfectedBankStaff.getY(180), root.TotalStaffBank.getY(180));

excelOutput.writeDataSet(root.Outbreak, 2, i, 1);
excelOutput.writeDataSet(root.AffectedHomes, 2, i, 3);
excelOutput.writeDataSet(root.Prevalence, 3, 2, ii);

/*excelOutput.writeDataSet(root.InfectedResidentsDS,2, 2, i);
i++;*/

i=i+12;
ii++; 
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void onAfterExperiment() {
    // After experiment code
        
excelOutput.writeDataSet(Ir90, 1, 2, 1);
excelOutput.writeDataSet(Ir180, 1, 2, 3);
excelOutput.writeDataSet(Death, 1, 2, 5);
excelOutput.writeDataSet(Is90, 1, 2, 7);
excelOutput.writeDataSet(Is180, 1, 2, 9);
excelOutput.writeDataSet(IShared90, 1, 2, 11);
excelOutput.writeDataSet(IShared180, 1, 2, 13); 
  }

  

  @Override
  @AnyLogicInternalCodegenAPI
  public void reset() {
    // Replications setup
    setUseReplications( false );
  }
  
  @Override
  public int getMaximumIterations() {
    return 1000;
  }
  
  @Override
  @AnyLogicInternalCodegenAPI
  public void setupRootParameters( final Main self, int index, boolean callOnChangeActions ) {
    final Main root = self; // for compatibility
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
    PCRCompliance_xjal = 
0 
;
    if (callOnChangeActions) {
      self.set_PCRCompliance( PCRCompliance_xjal );
    } else {
      self.PCRCompliance = PCRCompliance_xjal;
    }
    double shape1_xjal;
    shape1_xjal = self._shape1_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_shape1( shape1_xjal );
    } else {
      self.shape1 = shape1_xjal;
    }
    double mean_xjal;
    mean_xjal = self._mean_DefaultValue_xjal();
    if (callOnChangeActions) {
      self.set_mean( mean_xjal );
    } else {
      self.mean = mean_xjal;
    }
  }
  
}
