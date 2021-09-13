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

public class Main extends Agent
{
  // Parameters

  /**
   * Total number of care homes 
   */
  public 
int  TotalHomes;

  /**
   * Returns default value for parameter <code>TotalHomes</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _TotalHomes_DefaultValue_xjal() {
    final Main self = this;
    return 
12 
;
  }

  public void set_TotalHomes( int value ) {
    if (value == this.TotalHomes) {
      return;
    }
    int _oldValue_xjal = this.TotalHomes;
    this.TotalHomes = value;
    onChange_TotalHomes_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter TotalHomes.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_TotalHomes()</code> method instead.
   */
  protected void onChange_TotalHomes() {
    onChange_TotalHomes_xjal( TotalHomes );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_TotalHomes_xjal( int oldValue ) {  
  }


  public 
int  k;

  /**
   * Returns default value for parameter <code>k</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _k_DefaultValue_xjal() {
    final Main self = this;
    return 
5 
;
  }

  public void set_k( int value ) {
    if (value == this.k) {
      return;
    }
    int _oldValue_xjal = this.k;
    this.k = value;
    onChange_k_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter k.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_k()</code> method instead.
   */
  protected void onChange_k() {
    onChange_k_xjal( k );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_k_xjal( int oldValue ) {  
  }


  public 
int  j;

  /**
   * Returns default value for parameter <code>j</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _j_DefaultValue_xjal() {
    final Main self = this;
    return 
0 
;
  }

  public void set_j( int value ) {
    if (value == this.j) {
      return;
    }
    int _oldValue_xjal = this.j;
    this.j = value;
    onChange_j_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter j.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_j()</code> method instead.
   */
  protected void onChange_j() {
    onChange_j_xjal( j );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_j_xjal( int oldValue ) {  
  }


  public 
int  p;

  /**
   * Returns default value for parameter <code>p</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _p_DefaultValue_xjal() {
    final Main self = this;
    return 
0 
;
  }

  public void set_p( int value ) {
    if (value == this.p) {
      return;
    }
    int _oldValue_xjal = this.p;
    this.p = value;
    onChange_p_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter p.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_p()</code> method instead.
   */
  protected void onChange_p() {
    onChange_p_xjal( p );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_p_xjal( int oldValue ) {  
  }


  /**
   * The time elapsed between first exposure and becoming infectious
   */
  public 
double  ExposedTime(  ) {
    final Main self = this;
    return 
lognormal (1.16, 0.85, 1) 
;
  }

  /**
   * The risk of transmission per susceptible–infectious contact
   */
  public 
double  IP(  ) {
    final Main self = this;
    return 
//beta(5, 266, 0, 1)
beta(2, 117, 0, 1)
//0.02 
;
  }

  /**
   * The number of contacts with other residents per resident per day
   */
  public 
double  ContactRR;

  /**
   * Returns default value for parameter <code>ContactRR</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _ContactRR_DefaultValue_xjal() {
    final Main self = this;
    return 
4.1 
;
  }

  public void set_ContactRR( double value ) {
    if (value == this.ContactRR) {
      return;
    }
    double _oldValue_xjal = this.ContactRR;
    this.ContactRR = value;
    onChange_ContactRR_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter ContactRR.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_ContactRR()</code> method instead.
   */
  protected void onChange_ContactRR() {
    onChange_ContactRR_xjal( ContactRR );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_ContactRR_xjal( double oldValue ) {  
  }


  /**
   * The number of contacts with residents per staff member per day
   */
  public 
double  ContactRS;

  /**
   * Returns default value for parameter <code>ContactRS</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _ContactRS_DefaultValue_xjal() {
    final Main self = this;
    return 
7.9 
;
  }

  public void set_ContactRS( double value ) {
    if (value == this.ContactRS) {
      return;
    }
    double _oldValue_xjal = this.ContactRS;
    this.ContactRS = value;
    onChange_ContactRS_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter ContactRS.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_ContactRS()</code> method instead.
   */
  protected void onChange_ContactRS() {
    onChange_ContactRS_xjal( ContactRS );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_ContactRS_xjal( double oldValue ) {  
  }


  /**
   * The number of contacts with other staff members per staff member per day
   */
  public 
double  ContactSS;

  /**
   * Returns default value for parameter <code>ContactSS</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _ContactSS_DefaultValue_xjal() {
    final Main self = this;
    return 
9.6 
;
  }

  public void set_ContactSS( double value ) {
    if (value == this.ContactSS) {
      return;
    }
    double _oldValue_xjal = this.ContactSS;
    this.ContactSS = value;
    onChange_ContactSS_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter ContactSS.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_ContactSS()</code> method instead.
   */
  protected void onChange_ContactSS() {
    onChange_ContactSS_xjal( ContactSS );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_ContactSS_xjal( double oldValue ) {  
  }


  /**
   * The time elapsed between becoming infectious and onset of symptoms
   */
  public 
double  PresymptomaticTime(  ) {
    final Main self = this;
    return 
uniform_discr(1, 3) 
;
  }

  /**
   * Covid-related infection mortality rates (staff)
   */
  public 
double  IFRStaff(  ) {
    final Main self = this;
    return 
triangular(0.00003, 0.00315, 0.00007) 
;
  }

  /**
   * The time elapsed between onset of symptoms and recovery (or recovery time for those who remain asymptomatic)
   */
  public 
double  Infectiousness(  ) {
    final Main self = this;
    return 
lognormal(2.249, 0.246, 0) 
;
  }

  /**
   * The probability that an infected staff member will develop symptoms
   */
  public 
double  pStaffSymp;

  /**
   * Returns default value for parameter <code>pStaffSymp</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _pStaffSymp_DefaultValue_xjal() {
    final Main self = this;
    return 
0.6 
;
  }

  public void set_pStaffSymp( double value ) {
    if (value == this.pStaffSymp) {
      return;
    }
    double _oldValue_xjal = this.pStaffSymp;
    this.pStaffSymp = value;
    onChange_pStaffSymp_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter pStaffSymp.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_pStaffSymp()</code> method instead.
   */
  protected void onChange_pStaffSymp() {
    onChange_pStaffSymp_xjal( pStaffSymp );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_pStaffSymp_xjal( double oldValue ) {  
  }


  /**
   * Incidence rate in the community
   */
  public 
double  CommunityTransmission;

  /**
   * Returns default value for parameter <code>CommunityTransmission</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _CommunityTransmission_DefaultValue_xjal() {
    final Main self = this;
    return 
0//0.0002 
;
  }

  public void set_CommunityTransmission( double value ) {
    if (value == this.CommunityTransmission) {
      return;
    }
    double _oldValue_xjal = this.CommunityTransmission;
    this.CommunityTransmission = value;
    onChange_CommunityTransmission_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter CommunityTransmission.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_CommunityTransmission()</code> method instead.
   */
  protected void onChange_CommunityTransmission() {
    onChange_CommunityTransmission_xjal( CommunityTransmission );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_CommunityTransmission_xjal( double oldValue ) {  
  }


  public 
int  IsolationTime;

  /**
   * Returns default value for parameter <code>IsolationTime</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _IsolationTime_DefaultValue_xjal() {
    final Main self = this;
    return 
14 
;
  }

  public void set_IsolationTime( int value ) {
    if (value == this.IsolationTime) {
      return;
    }
    int _oldValue_xjal = this.IsolationTime;
    this.IsolationTime = value;
    onChange_IsolationTime_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter IsolationTime.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_IsolationTime()</code> method instead.
   */
  protected void onChange_IsolationTime() {
    onChange_IsolationTime_xjal( IsolationTime );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_IsolationTime_xjal( int oldValue ) {  
  }


  /**
   * Total number of bank/agency staff
   */
  public 
int  TotalSharedStaff;

  /**
   * Returns default value for parameter <code>TotalSharedStaff</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _TotalSharedStaff_DefaultValue_xjal() {
    final Main self = this;
    return 
107 
;
  }

  public void set_TotalSharedStaff( int value ) {
    if (value == this.TotalSharedStaff) {
      return;
    }
    int _oldValue_xjal = this.TotalSharedStaff;
    this.TotalSharedStaff = value;
    onChange_TotalSharedStaff_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter TotalSharedStaff.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_TotalSharedStaff()</code> method instead.
   */
  protected void onChange_TotalSharedStaff() {
    onChange_TotalSharedStaff_xjal( TotalSharedStaff );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_TotalSharedStaff_xjal( int oldValue ) {  
  }


  /**
   * The number of care home bubbles
   */
  public 
int  NBubbles;

  /**
   * Returns default value for parameter <code>NBubbles</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _NBubbles_DefaultValue_xjal() {
    final Main self = this;
    return 
1 
;
  }

  public void set_NBubbles( int value ) {
    if (value == this.NBubbles) {
      return;
    }
    int _oldValue_xjal = this.NBubbles;
    this.NBubbles = value;
    onChange_NBubbles_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter NBubbles.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_NBubbles()</code> method instead.
   */
  protected void onChange_NBubbles() {
    onChange_NBubbles_xjal( NBubbles );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_NBubbles_xjal( int oldValue ) {  
  }


  public 
int  TotalAffectedHomes;

  /**
   * Returns default value for parameter <code>TotalAffectedHomes</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _TotalAffectedHomes_DefaultValue_xjal() {
    final Main self = this;
    return 
0 
;
  }

  public void set_TotalAffectedHomes( int value ) {
    if (value == this.TotalAffectedHomes) {
      return;
    }
    int _oldValue_xjal = this.TotalAffectedHomes;
    this.TotalAffectedHomes = value;
    onChange_TotalAffectedHomes_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter TotalAffectedHomes.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_TotalAffectedHomes()</code> method instead.
   */
  protected void onChange_TotalAffectedHomes() {
    onChange_TotalAffectedHomes_xjal( TotalAffectedHomes );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_TotalAffectedHomes_xjal( int oldValue ) {  
  }


  /**
   * The proportion of bank/agency staff to total staff (i.e. the level of bank/agency staff use)
   */
  public 
double  Usage;

  /**
   * Returns default value for parameter <code>Usage</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Usage_DefaultValue_xjal() {
    final Main self = this;
    return 
0.1 
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


  /**
   * The sensitivity of RT-PCR test
   */
  public 
double  PCRSens;

  /**
   * Returns default value for parameter <code>PCRSens</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _PCRSens_DefaultValue_xjal() {
    final Main self = this;
    return 
0.9 
;
  }

  public void set_PCRSens( double value ) {
    if (value == this.PCRSens) {
      return;
    }
    double _oldValue_xjal = this.PCRSens;
    this.PCRSens = value;
    onChange_PCRSens_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter PCRSens.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_PCRSens()</code> method instead.
   */
  protected void onChange_PCRSens() {
    onChange_PCRSens_xjal( PCRSens );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_PCRSens_xjal( double oldValue ) {  
  }


  /**
   * The interval of routine testing of staff 
   */
  public 
int  TestInterval;

  /**
   * Returns default value for parameter <code>TestInterval</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _TestInterval_DefaultValue_xjal() {
    final Main self = this;
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
int  TRT;

  /**
   * Returns default value for parameter <code>TRT</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _TRT_DefaultValue_xjal() {
    final Main self = this;
    return 
2 
;
  }

  public void set_TRT( int value ) {
    if (value == this.TRT) {
      return;
    }
    int _oldValue_xjal = this.TRT;
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
  protected void onChange_TRT_xjal( int oldValue ) {  
  }


  /**
   * Test sensitivity of Lateral Flow Device test
   */
  public 
double  LFTSens;

  /**
   * Returns default value for parameter <code>LFTSens</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _LFTSens_DefaultValue_xjal() {
    final Main self = this;
    return 
0.58
//triangular(0.4, 0.85, 0.58) 
;
  }

  public void set_LFTSens( double value ) {
    if (value == this.LFTSens) {
      return;
    }
    double _oldValue_xjal = this.LFTSens;
    this.LFTSens = value;
    onChange_LFTSens_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter LFTSens.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_LFTSens()</code> method instead.
   */
  protected void onChange_LFTSens() {
    onChange_LFTSens_xjal( LFTSens );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_LFTSens_xjal( double oldValue ) {  
  }


  public 
int  t;

  /**
   * Returns default value for parameter <code>t</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public int _t_DefaultValue_xjal() {
    final Main self = this;
    return 
20 
;
  }

  public void set_t( int value ) {
    if (value == this.t) {
      return;
    }
    int _oldValue_xjal = this.t;
    this.t = value;
    onChange_t_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter t.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_t()</code> method instead.
   */
  protected void onChange_t() {
    onChange_t_xjal( t );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_t_xjal( int oldValue ) {  
  }


  /**
   * Staff turnover rate 24% per year
   */
  public 
double  Turnover;

  /**
   * Returns default value for parameter <code>Turnover</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Turnover_DefaultValue_xjal() {
    final Main self = this;
    return 
0.24 
;
  }

  public void set_Turnover( double value ) {
    if (value == this.Turnover) {
      return;
    }
    double _oldValue_xjal = this.Turnover;
    this.Turnover = value;
    onChange_Turnover_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Turnover.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Turnover()</code> method instead.
   */
  protected void onChange_Turnover() {
    onChange_Turnover_xjal( Turnover );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Turnover_xjal( double oldValue ) {  
  }


  /**
   * The incidence in the community is adjusted to account for undetected cases.
   */
  public 
double  Adjusted;

  /**
   * Returns default value for parameter <code>Adjusted</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _Adjusted_DefaultValue_xjal() {
    final Main self = this;
    return 
0.5 
;
  }

  public void set_Adjusted( double value ) {
    if (value == this.Adjusted) {
      return;
    }
    double _oldValue_xjal = this.Adjusted;
    this.Adjusted = value;
    onChange_Adjusted_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter Adjusted.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_Adjusted()</code> method instead.
   */
  protected void onChange_Adjusted() {
    onChange_Adjusted_xjal( Adjusted );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_Adjusted_xjal( double oldValue ) {  
  }


  public 
double  pRule;

  /**
   * Returns default value for parameter <code>pRule</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _pRule_DefaultValue_xjal() {
    final Main self = this;
    return 
0.5 
;
  }

  public void set_pRule( double value ) {
    if (value == this.pRule) {
      return;
    }
    double _oldValue_xjal = this.pRule;
    this.pRule = value;
    onChange_pRule_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter pRule.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_pRule()</code> method instead.
   */
  protected void onChange_pRule() {
    onChange_pRule_xjal( pRule );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_pRule_xjal( double oldValue ) {  
  }


  /**
   * The compliance to routine PCR testing in bank/agency staff
   */
  public 
double  PCRCompliance;

  /**
   * Returns default value for parameter <code>PCRCompliance</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _PCRCompliance_DefaultValue_xjal() {
    final Main self = this;
    return 
0 
;
  }

  public void set_PCRCompliance( double value ) {
    if (value == this.PCRCompliance) {
      return;
    }
    double _oldValue_xjal = this.PCRCompliance;
    this.PCRCompliance = value;
    onChange_PCRCompliance_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter PCRCompliance.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_PCRCompliance()</code> method instead.
   */
  protected void onChange_PCRCompliance() {
    onChange_PCRCompliance_xjal( PCRCompliance );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_PCRCompliance_xjal( double oldValue ) {  
  }


  public 
double  shape1;

  /**
   * Returns default value for parameter <code>shape1</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _shape1_DefaultValue_xjal() {
    final Main self = this;
    return 
5 
;
  }

  public void set_shape1( double value ) {
    if (value == this.shape1) {
      return;
    }
    double _oldValue_xjal = this.shape1;
    this.shape1 = value;
    onChange_shape1_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter shape1.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_shape1()</code> method instead.
   */
  protected void onChange_shape1() {
    onChange_shape1_xjal( shape1 );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_shape1_xjal( double oldValue ) {  
  }


  public 
double  mean;

  /**
   * Returns default value for parameter <code>mean</code>.
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  public double _mean_DefaultValue_xjal() {
    final Main self = this;
    return 
0.02 
;
  }

  public void set_mean( double value ) {
    if (value == this.mean) {
      return;
    }
    double _oldValue_xjal = this.mean;
    this.mean = value;
    onChange_mean_xjal( _oldValue_xjal );
    onChange();
  }

  /**
   * Calls "On change" action for parameter mean.<br>
   * Note that 'oldValue' in that action will be unavailable if this method is called by user
   * (current parameter value will be passed as 'oldValue').<br>
   * Please call <code>set_mean()</code> method instead.
   */
  protected void onChange_mean() {
    onChange_mean_xjal( mean );
  }

  @AnyLogicInternalCodegenAPI
  protected void onChange_mean_xjal( double oldValue ) {  
  }


  @Override
  public void setParametersToDefaultValues() {
    super.setParametersToDefaultValues();
    TotalHomes = _TotalHomes_DefaultValue_xjal();
    k = _k_DefaultValue_xjal();
    j = _j_DefaultValue_xjal();
    p = _p_DefaultValue_xjal();
    ContactRR = _ContactRR_DefaultValue_xjal();
    ContactRS = _ContactRS_DefaultValue_xjal();
    ContactSS = _ContactSS_DefaultValue_xjal();
    pStaffSymp = _pStaffSymp_DefaultValue_xjal();
    CommunityTransmission = _CommunityTransmission_DefaultValue_xjal();
    IsolationTime = _IsolationTime_DefaultValue_xjal();
    TotalSharedStaff = _TotalSharedStaff_DefaultValue_xjal();
    NBubbles = _NBubbles_DefaultValue_xjal();
    TotalAffectedHomes = _TotalAffectedHomes_DefaultValue_xjal();
    Usage = _Usage_DefaultValue_xjal();
    PCRSens = _PCRSens_DefaultValue_xjal();
    TestInterval = _TestInterval_DefaultValue_xjal();
    TRT = _TRT_DefaultValue_xjal();
    LFTSens = _LFTSens_DefaultValue_xjal();
    t = _t_DefaultValue_xjal();
    Turnover = _Turnover_DefaultValue_xjal();
    Adjusted = _Adjusted_DefaultValue_xjal();
    pRule = _pRule_DefaultValue_xjal();
    PCRCompliance = _PCRCompliance_DefaultValue_xjal();
    shape1 = _shape1_DefaultValue_xjal();
    mean = _mean_DefaultValue_xjal();
  }

  @Override
  public boolean setParameter(String _name_xjal, Object _value_xjal, boolean _callOnChange_xjal) {
    switch ( _name_xjal ) {
    case "TotalHomes":
      if ( _callOnChange_xjal ) {
        set_TotalHomes( ((Number) _value_xjal).intValue() );
      } else {
        TotalHomes = ((Number) _value_xjal).intValue();
      }
      return true;
    case "k":
      if ( _callOnChange_xjal ) {
        set_k( ((Number) _value_xjal).intValue() );
      } else {
        k = ((Number) _value_xjal).intValue();
      }
      return true;
    case "j":
      if ( _callOnChange_xjal ) {
        set_j( ((Number) _value_xjal).intValue() );
      } else {
        j = ((Number) _value_xjal).intValue();
      }
      return true;
    case "p":
      if ( _callOnChange_xjal ) {
        set_p( ((Number) _value_xjal).intValue() );
      } else {
        p = ((Number) _value_xjal).intValue();
      }
      return true;
    case "ContactRR":
      if ( _callOnChange_xjal ) {
        set_ContactRR( ((Number) _value_xjal).doubleValue() );
      } else {
        ContactRR = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "ContactRS":
      if ( _callOnChange_xjal ) {
        set_ContactRS( ((Number) _value_xjal).doubleValue() );
      } else {
        ContactRS = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "ContactSS":
      if ( _callOnChange_xjal ) {
        set_ContactSS( ((Number) _value_xjal).doubleValue() );
      } else {
        ContactSS = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "pStaffSymp":
      if ( _callOnChange_xjal ) {
        set_pStaffSymp( ((Number) _value_xjal).doubleValue() );
      } else {
        pStaffSymp = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "CommunityTransmission":
      if ( _callOnChange_xjal ) {
        set_CommunityTransmission( ((Number) _value_xjal).doubleValue() );
      } else {
        CommunityTransmission = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "IsolationTime":
      if ( _callOnChange_xjal ) {
        set_IsolationTime( ((Number) _value_xjal).intValue() );
      } else {
        IsolationTime = ((Number) _value_xjal).intValue();
      }
      return true;
    case "TotalSharedStaff":
      if ( _callOnChange_xjal ) {
        set_TotalSharedStaff( ((Number) _value_xjal).intValue() );
      } else {
        TotalSharedStaff = ((Number) _value_xjal).intValue();
      }
      return true;
    case "NBubbles":
      if ( _callOnChange_xjal ) {
        set_NBubbles( ((Number) _value_xjal).intValue() );
      } else {
        NBubbles = ((Number) _value_xjal).intValue();
      }
      return true;
    case "TotalAffectedHomes":
      if ( _callOnChange_xjal ) {
        set_TotalAffectedHomes( ((Number) _value_xjal).intValue() );
      } else {
        TotalAffectedHomes = ((Number) _value_xjal).intValue();
      }
      return true;
    case "Usage":
      if ( _callOnChange_xjal ) {
        set_Usage( ((Number) _value_xjal).doubleValue() );
      } else {
        Usage = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "PCRSens":
      if ( _callOnChange_xjal ) {
        set_PCRSens( ((Number) _value_xjal).doubleValue() );
      } else {
        PCRSens = ((Number) _value_xjal).doubleValue();
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
        set_TRT( ((Number) _value_xjal).intValue() );
      } else {
        TRT = ((Number) _value_xjal).intValue();
      }
      return true;
    case "LFTSens":
      if ( _callOnChange_xjal ) {
        set_LFTSens( ((Number) _value_xjal).doubleValue() );
      } else {
        LFTSens = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "t":
      if ( _callOnChange_xjal ) {
        set_t( ((Number) _value_xjal).intValue() );
      } else {
        t = ((Number) _value_xjal).intValue();
      }
      return true;
    case "Turnover":
      if ( _callOnChange_xjal ) {
        set_Turnover( ((Number) _value_xjal).doubleValue() );
      } else {
        Turnover = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "Adjusted":
      if ( _callOnChange_xjal ) {
        set_Adjusted( ((Number) _value_xjal).doubleValue() );
      } else {
        Adjusted = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "pRule":
      if ( _callOnChange_xjal ) {
        set_pRule( ((Number) _value_xjal).doubleValue() );
      } else {
        pRule = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "PCRCompliance":
      if ( _callOnChange_xjal ) {
        set_PCRCompliance( ((Number) _value_xjal).doubleValue() );
      } else {
        PCRCompliance = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "shape1":
      if ( _callOnChange_xjal ) {
        set_shape1( ((Number) _value_xjal).doubleValue() );
      } else {
        shape1 = ((Number) _value_xjal).doubleValue();
      }
      return true;
    case "mean":
      if ( _callOnChange_xjal ) {
        set_mean( ((Number) _value_xjal).doubleValue() );
      } else {
        mean = ((Number) _value_xjal).doubleValue();
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
    case "TotalHomes": _result_xjal = TotalHomes; break;
    case "k": _result_xjal = k; break;
    case "j": _result_xjal = j; break;
    case "p": _result_xjal = p; break;
    case "ContactRR": _result_xjal = ContactRR; break;
    case "ContactRS": _result_xjal = ContactRS; break;
    case "ContactSS": _result_xjal = ContactSS; break;
    case "pStaffSymp": _result_xjal = pStaffSymp; break;
    case "CommunityTransmission": _result_xjal = CommunityTransmission; break;
    case "IsolationTime": _result_xjal = IsolationTime; break;
    case "TotalSharedStaff": _result_xjal = TotalSharedStaff; break;
    case "NBubbles": _result_xjal = NBubbles; break;
    case "TotalAffectedHomes": _result_xjal = TotalAffectedHomes; break;
    case "Usage": _result_xjal = Usage; break;
    case "PCRSens": _result_xjal = PCRSens; break;
    case "TestInterval": _result_xjal = TestInterval; break;
    case "TRT": _result_xjal = TRT; break;
    case "LFTSens": _result_xjal = LFTSens; break;
    case "t": _result_xjal = t; break;
    case "Turnover": _result_xjal = Turnover; break;
    case "Adjusted": _result_xjal = Adjusted; break;
    case "pRule": _result_xjal = pRule; break;
    case "PCRCompliance": _result_xjal = PCRCompliance; break;
    case "shape1": _result_xjal = shape1; break;
    case "mean": _result_xjal = mean; break;
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
      list.add( "TotalHomes" );
      list.add( "k" );
      list.add( "j" );
      list.add( "p" );
      list.add( "ContactRR" );
      list.add( "ContactRS" );
      list.add( "ContactSS" );
      list.add( "pStaffSymp" );
      list.add( "CommunityTransmission" );
      list.add( "IsolationTime" );
      list.add( "TotalSharedStaff" );
      list.add( "NBubbles" );
      list.add( "TotalAffectedHomes" );
      list.add( "Usage" );
      list.add( "PCRSens" );
      list.add( "TestInterval" );
      list.add( "TRT" );
      list.add( "LFTSens" );
      list.add( "t" );
      list.add( "Turnover" );
      list.add( "Adjusted" );
      list.add( "pRule" );
      list.add( "PCRCompliance" );
      list.add( "shape1" );
      list.add( "mean" );
      result = list.toArray( new String[ list.size() ] );
      _parameterNames_xjal = result;
    }
    return result;
  }
  // Plain Variables

  public 
int 
 CumInfectedBankStaff;
  public 
int 
 TotalBankStaff;
  public 
int 
 timestep;
  public 
double [] 
 NBub;
  public 
double 
 NShared;
  public 
int 
 TestON;
  public 
int 
 TestReturn;
  @AnyLogicInternalCodegenAPI
  private static Map<String, IElementDescriptor> elementDesciptors_xjal = createElementDescriptors( Main.class );
  
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
	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _CumInfectedResidents_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _CumInfectedStaff_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _CumDeaths_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _TotalStaff_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _TotalResidents_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _InfectedBankStaff_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _TotalStaffBank_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _Prevalence_autoUpdateEvent_xjal = new EventTimeout(this);	
  @AnyLogicInternalCodegenAPI
  public EventTimeout _InfectedResidentsDS_autoUpdateEvent_xjal = new EventTimeout(this);

  @Override
  @AnyLogicInternalCodegenAPI
  public String getNameOf( EventTimeout _e ) {
     if( _e == _CumInfectedResidents_autoUpdateEvent_xjal ) return "CumInfectedResidents auto update event";
     if( _e == _CumInfectedStaff_autoUpdateEvent_xjal ) return "CumInfectedStaff auto update event";
     if( _e == _CumDeaths_autoUpdateEvent_xjal ) return "CumDeaths auto update event";
     if( _e == _TotalStaff_autoUpdateEvent_xjal ) return "TotalStaff auto update event";
     if( _e == _TotalResidents_autoUpdateEvent_xjal ) return "TotalResidents auto update event";
     if( _e == _InfectedBankStaff_autoUpdateEvent_xjal ) return "InfectedBankStaff auto update event";
     if( _e == _TotalStaffBank_autoUpdateEvent_xjal ) return "TotalStaffBank auto update event";
     if( _e == _Prevalence_autoUpdateEvent_xjal ) return "Prevalence auto update event";
     if( _e == _InfectedResidentsDS_autoUpdateEvent_xjal ) return "InfectedResidentsDS auto update event";
    return super.getNameOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public EventTimeout.Mode getModeOf( EventTimeout _e ) {
    if ( _e == _CumInfectedResidents_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _CumInfectedStaff_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _CumDeaths_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _TotalStaff_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _TotalResidents_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _InfectedBankStaff_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _TotalStaffBank_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _Prevalence_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    if ( _e == _InfectedResidentsDS_autoUpdateEvent_xjal ) return EVENT_TIMEOUT_MODE_CYCLIC;
    return super.getModeOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double getFirstOccurrenceTime( EventTimeout _e ) {
    double _t;
    if ( _e == _CumInfectedResidents_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _CumInfectedStaff_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _CumDeaths_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _TotalStaff_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _TotalResidents_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _InfectedBankStaff_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _TotalStaffBank_autoUpdateEvent_xjal ) {
      _t = 
0 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if ( _e == _Prevalence_autoUpdateEvent_xjal ) {
      _t = 
1 
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
    return super.getFirstOccurrenceTime( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public double evaluateTimeoutOf( EventTimeout _e ) {
    double _t;
    if( _e == _CumInfectedResidents_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _CumInfectedStaff_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _CumDeaths_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _TotalStaff_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _TotalResidents_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _InfectedBankStaff_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _TotalStaffBank_autoUpdateEvent_xjal) {
      _t = 
1 
;
      _t = toModelTime( _t, DAY );
      return _t;
    }
    if( _e == _Prevalence_autoUpdateEvent_xjal) {
      _t = 
1 
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
    return super.evaluateTimeoutOf( _e );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void executeActionOf( EventTimeout _e ) {
    if ( _e == _CumInfectedResidents_autoUpdateEvent_xjal ) {
      CumInfectedResidents.update();
      return;
    }
    if ( _e == _CumInfectedStaff_autoUpdateEvent_xjal ) {
      CumInfectedStaff.update();
      return;
    }
    if ( _e == _CumDeaths_autoUpdateEvent_xjal ) {
      CumDeaths.update();
      return;
    }
    if ( _e == _TotalStaff_autoUpdateEvent_xjal ) {
      TotalStaff.update();
      return;
    }
    if ( _e == _TotalResidents_autoUpdateEvent_xjal ) {
      TotalResidents.update();
      return;
    }
    if ( _e == _InfectedBankStaff_autoUpdateEvent_xjal ) {
      InfectedBankStaff.update();
      return;
    }
    if ( _e == _TotalStaffBank_autoUpdateEvent_xjal ) {
      TotalStaffBank.update();
      return;
    }
    if ( _e == _Prevalence_autoUpdateEvent_xjal ) {
      Prevalence.update();
      return;
    }
    if ( _e == _InfectedResidentsDS_autoUpdateEvent_xjal ) {
      InfectedResidentsDS.update();
      return;
    }
    super.executeActionOf( _e );
  }

	

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _STATECHART_COUNT_xjal = 0;


  // Embedded Objects

  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _homes_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);
  @AnyLogicInternalCodegenAPI
  private static final AgentAnimationSettings _sharedStaffs_animationSettings_xjal = new AgentAnimationSettings(1000L, 1000000000L);

  public String getNameOf( Agent ao ) {
    return super.getNameOf( ao );
  }

  public AgentAnimationSettings getAnimationSettingsOf( Agent ao ) {
    return super.getAnimationSettingsOf( ao );
  }

  public class _homes_Population extends AgentArrayList<Home> {
    _homes_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public Home instantiateAgent( int index ) {
    	return instantiate_homes_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( Home agent, int index, TableInput tableInput ) {
      setupParameters_homes_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( Home agent, int index, TableInput tableInput ) {
      doBeforeCreate_homes_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }


    public double TotalInfectedResidents() {
      return _homes_TotalInfectedResidents_xjal();
    }

    public double CumIr() {
      return _homes_CumIr_xjal();
    }

    public double CumIs() {
      return _homes_CumIs_xjal();
    }

    public double CumDeath() {
      return _homes_CumDeath_xjal();
    }

    public double TotalStaff() {
      return _homes_TotalStaff_xjal();
    }

    public double TotalResidents() {
      return _homes_TotalResidents_xjal();
    }
  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "Home")
  public _homes_Population homes = new _homes_Population( this );
  public class _sharedStaffs_Population extends AgentArrayList<SharedStaff> {
    _sharedStaffs_Population( Agent owner ) {
      super( owner );
    }

    @AnyLogicInternalCodegenAPI
    public SharedStaff instantiateAgent( int index ) {
    	return instantiate_sharedStaffs_xjal( index );
    }

    @AnyLogicInternalCodegenAPI
    public void callSetupParameters( SharedStaff agent, int index, TableInput tableInput ) {
      setupParameters_sharedStaffs_xjal( agent, index, tableInput );
    }

    @AnyLogicInternalCodegenAPI
    public void callCreate( SharedStaff agent, int index, TableInput tableInput ) {
      doBeforeCreate_sharedStaffs_xjal( agent, index, tableInput );
      agent.create();
    }

    @AnyLogicInternalCodegenAPI
    public boolean isPresentationEnabled() {
      return true;
    }


    public int NGroupID() {
      return _sharedStaffs_NGroupID_xjal();
    }
  }
  
  @AnyLogicCustomProposalType(value = AnyLogicCustomProposalType.Label.POPULATION, customText = "SharedStaff")
  public _sharedStaffs_Population sharedStaffs = new _sharedStaffs_Population( this );

  public String getNameOf( AgentList<?> aolist ) {
    if( aolist == homes ) return "homes";
    if( aolist == sharedStaffs ) return "sharedStaffs";
    return super.getNameOf( aolist );
  }
  
  public AgentAnimationSettings getAnimationSettingsOf( AgentList<?> aolist ) {
    if( aolist == homes ) return _homes_animationSettings_xjal;
    if( aolist == sharedStaffs ) return _sharedStaffs_animationSettings_xjal;
    return super.getAnimationSettingsOf( aolist );
  }

  /**
   * Returns the agent element at the specified position in homes
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public Home homes(int index) {
    return homes.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection homes<br>
   * @return newly created embedded object
   */
  public Home add_homes() {
    int index = homes.size();
    Home _result_xjal = instantiate_homes_xjal( index );
    homes.callSetupParameters( _result_xjal, index );
    homes.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection homes<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>homes.size()</code> method <strong>before</strong> this method is called
   * @param ID
   * @param GroupID
   * @param NSharedSs
   * @param TestInterval
   * @param TRT
   * @param TestON
   * @param TestReturn
   * @param NSharedIs
   * @param NShared
   * @param Nr
   * @param Ns
   * @param Usage
   * @param Nu
   * @param Outbreak
   * @return newly created embedded object
   */
  public Home add_homes( int ID, int GroupID, int NSharedSs, int TestInterval, double TRT, double TestON, double TestReturn, int NSharedIs, int NShared, int Nr, int Ns, double Usage, double Nu, double Outbreak ) {
    int index = homes.size();
    Home _result_xjal = instantiate_homes_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.ID = ID;
    _result_xjal.GroupID = GroupID;
    _result_xjal.NSharedSs = NSharedSs;
    _result_xjal.TestInterval = TestInterval;
    _result_xjal.TRT = TRT;
    _result_xjal.TestON = TestON;
    _result_xjal.TestReturn = TestReturn;
    _result_xjal.NSharedIs = NSharedIs;
    _result_xjal.NShared = NShared;
    _result_xjal.Nr = Nr;
    _result_xjal.Ns = Ns;
    _result_xjal.Usage = Usage;
    _result_xjal.Nu = Nu;
    _result_xjal.Outbreak = Outbreak;
    // Finish embedded object creation
    homes.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection homes<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object homes - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to homes
   */
  public boolean remove_homes( Home object ) {
    if( ! homes._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }
  /**
   * Returns the agent element at the specified position in sharedStaffs
   * population.
   * @see com.anylogic.engine.AgentList#get(int)
   * @since 7.3.7
   */
  public SharedStaff sharedStaffs(int index) {
    return sharedStaffs.get( index );
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection sharedStaffs<br>
   * @return newly created embedded object
   */
  public SharedStaff add_sharedStaffs() {
    int index = sharedStaffs.size();
    SharedStaff _result_xjal = instantiate_sharedStaffs_xjal( index );
    sharedStaffs.callSetupParameters( _result_xjal, index );
    sharedStaffs.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method creates and adds new embedded object in the replicated embedded object collection sharedStaffs<br>
   * This method uses given parameter values to setup created embedded object<br>
   * Index of this new embedded object instance can be obtained through calling <code>sharedStaffs.size()</code> method <strong>before</strong> this method is called
   * @param Isolation
   * @param WorkID
   * @param GroupID
   * @param WorkRecord
   * @param Detected
   * @return newly created embedded object
   */
  public SharedStaff add_sharedStaffs( boolean Isolation, int WorkID, int GroupID, double[] WorkRecord, boolean Detected ) {
    int index = sharedStaffs.size();
    SharedStaff _result_xjal = instantiate_sharedStaffs_xjal( index );
    // Setup parameters
    _result_xjal.markParametersAreSet();
    _result_xjal.Isolation = Isolation;
    _result_xjal.WorkID = WorkID;
    _result_xjal.GroupID = GroupID;
    _result_xjal.WorkRecord = WorkRecord;
    _result_xjal.Detected = Detected;
    // Finish embedded object creation
    sharedStaffs.callCreate( _result_xjal, index );
    _result_xjal.start();
    return _result_xjal;
  }

  /**
   * This method removes the given embedded object from the replicated embedded object collection sharedStaffs<br>
   * The given object is destroyed, but not immediately in common case.
   * @param object the active object - element of replicated embedded object sharedStaffs - which should be removed
   * @return <code>true</code> if object was removed successfully, <code>false</code> if it doesn't belong to sharedStaffs
   */
  public boolean remove_sharedStaffs( SharedStaff object ) {
    if( ! sharedStaffs._remove( object ) ) {
      return false;
    }
    object.removeFromFlowchart();
    object.setDestroyed();
    return true;
  }

  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected Home instantiate_homes_xjal( final int index ) {
    Home _result_xjal = new Home( getEngine(), this, homes );
    
    homes._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_homes_xjal( final Home self, final int index, TableInput _t ) {
    self.ID = self._ID_DefaultValue_xjal();
    self.GroupID = self._GroupID_DefaultValue_xjal();
    self.NSharedSs = self._NSharedSs_DefaultValue_xjal();
    self.TestInterval = self._TestInterval_DefaultValue_xjal();
    self.TRT = self._TRT_DefaultValue_xjal();
    self.TestON = self._TestON_DefaultValue_xjal();
    self.TestReturn = self._TestReturn_DefaultValue_xjal();
    self.NSharedIs = self._NSharedIs_DefaultValue_xjal();
    self.NShared = self._NShared_DefaultValue_xjal();
    self.Nr = self._Nr_DefaultValue_xjal();
    self.Ns = self._Ns_DefaultValue_xjal();
    self.Usage = self._Usage_DefaultValue_xjal();
    self.Nu = self._Nu_DefaultValue_xjal();
    self.Outbreak = self._Outbreak_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_homes_xjal( Home self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }
  /**
   * Creates an embedded object instance and adds it to the end of replicated embedded object list<br>
   * <i>This method should not be called by user</i>
   */
  protected SharedStaff instantiate_sharedStaffs_xjal( final int index ) {
    SharedStaff _result_xjal = new SharedStaff( getEngine(), this, sharedStaffs );
    
    sharedStaffs._add( _result_xjal );

    return _result_xjal;
  }

  /**
   * Setups parameters of an embedded object instance<br>
   * This method should not be called by user
   */
  private void setupParameters_sharedStaffs_xjal( final SharedStaff self, final int index, TableInput _t ) {
    self.Isolation = self._Isolation_DefaultValue_xjal();
    self.WorkID = self._WorkID_DefaultValue_xjal();
    self.GroupID = self._GroupID_DefaultValue_xjal();
    self.WorkRecord = self._WorkRecord_DefaultValue_xjal();
    self.Detected = self._Detected_DefaultValue_xjal();
  }

  /**
   * Setups an embedded object instance<br>
   * This method should not be called by user
   */
  @AnyLogicInternalCodegenAPI
  private void doBeforeCreate_sharedStaffs_xjal( SharedStaff self, final int index, TableInput _t ) {
    self.setEnvironment( this );

    // Port connections
  }

  /**
   * <i>This method should not be called by user</i>
   */
  private double _homes_TotalInfectedResidents_xjal() {
    double _value = 0;
    for ( Home item : homes ) {
        _value += 
item.Ir + item.Er + item.Qr 
;
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private double _homes_CumIr_xjal() {
    double _value = 0;
    for ( Home item : homes ) {
        _value += 
item.CumIr 
;
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private double _homes_CumIs_xjal() {
    double _value = 0;
    for ( Home item : homes ) {
        _value += 
item.CumIs 
;
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private double _homes_CumDeath_xjal() {
    double _value = 0;
    for ( Home item : homes ) {
        _value += 
item.CumDeath 
;
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private double _homes_TotalStaff_xjal() {
    double _value = 0;
    for ( Home item : homes ) {
        _value += 
item.TotalS 
;
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private double _homes_TotalResidents_xjal() {
    double _value = 0;
    for ( Home item : homes ) {
        _value += 
item.TotalR 
;
    }
    return _value;
  }
  /**
   * <i>This method should not be called by user</i>
   */
  private int _sharedStaffs_NGroupID_xjal() {
    int _value = 0;
    for ( SharedStaff item : sharedStaffs ) {
      boolean _t = 
item.GroupID > 0 
;
      if ( _t ) {
        _value++;
      }
    }
    return _value;
  }
  // Analysis Data Elements
  public DataSet CumInfectedResidents = new DataSet( 365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), _CumInfectedResidents_YValue() );
      _lastUpdateX = time();
    }
    @Override
    public double getDataXValue() {
      return time();
    }
  } );

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _CumInfectedResidents_YValue() {
    return 
homes.CumIr() 
;
  }
  
  public DataSet CumInfectedStaff = new DataSet( 365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), _CumInfectedStaff_YValue() );
      _lastUpdateX = time();
    }
    @Override
    public double getDataXValue() {
      return time();
    }
  } );

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _CumInfectedStaff_YValue() {
    return 
homes.CumIs() 
;
  }
  
  public DataSet CumDeaths = new DataSet( 365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), _CumDeaths_YValue() );
      _lastUpdateX = time();
    }
    @Override
    public double getDataXValue() {
      return time();
    }
  } );

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _CumDeaths_YValue() {
    return 
homes.CumDeath() 
;
  }
  
  public DataSet TotalStaff = new DataSet( 365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), _TotalStaff_YValue() );
      _lastUpdateX = time();
    }
    @Override
    public double getDataXValue() {
      return time();
    }
  } );

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _TotalStaff_YValue() {
    return 
homes.TotalStaff() 
;
  }
  
  public DataSet TotalResidents = new DataSet( 365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), _TotalResidents_YValue() );
      _lastUpdateX = time();
    }
    @Override
    public double getDataXValue() {
      return time();
    }
  } );

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _TotalResidents_YValue() {
    return 
homes.TotalResidents() 
;
  }
  
  public DataSet InfectedBankStaff = new DataSet( 365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), _InfectedBankStaff_YValue() );
      _lastUpdateX = time();
    }
    @Override
    public double getDataXValue() {
      return time();
    }
  } );

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _InfectedBankStaff_YValue() {
    return 
CumInfectedBankStaff 
;
  }
  
  public DataSet Outbreak = new DataSet( 365 );
  
  public DataSet TotalStaffBank = new DataSet( 365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), _TotalStaffBank_YValue() );
      _lastUpdateX = time();
    }
    @Override
    public double getDataXValue() {
      return time();
    }
  } );

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _TotalStaffBank_YValue() {
    return 
TotalBankStaff 
;
  }
  
  public DataSet AffectedHomes = new DataSet( 365 );
  
  public DataSet Prevalence = new DataSet( 365, new DataUpdater_xjal() {
    double _lastUpdateX = Double.NaN;
    @Override
    public void update( DataSet _d ) {
      if ( time() == _lastUpdateX ) { return; }
      _d.add( time(), _Prevalence_YValue() );
      _lastUpdateX = time();
    }
    @Override
    public double getDataXValue() {
      return time();
    }
  } );

  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  private double _Prevalence_YValue() {
    return 
homes.TotalInfectedResidents() 
;
  }
  
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
homes.TotalInfectedResidents() 
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
  @AnyLogicInternalCodegenAPI
  protected static final int _homes_presentation = 1;
  @AnyLogicInternalCodegenAPI
  protected static final int _sharedStaffs_presentation = 2;

  /** Internal constant, shouldn't be accessed by user */
  @AnyLogicInternalCodegenAPI
  protected static final int _SHAPE_NEXT_ID_xjal = 3;

  @AnyLogicInternalCodegenAPI
  public boolean isPublicPresentationDefined() {
    return false;
  }

  @AnyLogicInternalCodegenAPI
  public boolean isEmbeddedAgentPresentationVisible( Agent _a ) {
    return super.isEmbeddedAgentPresentationVisible( _a );
  }
  @AnyLogicInternalCodegenAPI
  private void _initialize_level_xjal() {
	  level.addAll();
  }

  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _homes_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D3D, true, -30.0, 50.0, 0.0, 0.0,
		false, true, _a );

    return shape;
  }

  protected ShapeAgentPopulationGroup homes_presentation;
  
  /**
   * <i>This method should not be called by user</i>
   */
  @AnyLogicInternalCodegenAPI
  protected ShapeEmbeddedObjectPresentation _sharedStaffs_presentation_createShapeWithStaticProperties_xjal( final Agent _a, final int _index ) {
    ShapeEmbeddedObjectPresentation shape = new ShapeEmbeddedObjectPresentation( Main.this, SHAPE_DRAW_2D, true, 250.0, -250.0, 0.0, 0.0,
		true, true, _a );

    return shape;
  }

  protected ShapeAgentPopulationGroup sharedStaffs_presentation;
  protected com.anylogic.engine.markup.Level level;

  private com.anylogic.engine.markup.Level[] _getLevels_xjal;

  @Override
  public com.anylogic.engine.markup.Level[] getLevels() {
    return _getLevels_xjal;
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsBP0_xjal() {
  }

  @AnyLogicInternalCodegenAPI
  private void _createPersistentElementsAP0_xjal() {
    homes_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D3D, true, homes) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _homes_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
    };
    sharedStaffs_presentation = new ShapeAgentPopulationGroup(this, SHAPE_DRAW_2D, true, sharedStaffs) {
    
      @Override
      public ShapeEmbeddedObjectPresentation createShapeWithStaticProperties_xjal( final Agent _a, int index ) {
        ShapeEmbeddedObjectPresentation _e = _sharedStaffs_presentation_createShapeWithStaticProperties_xjal( _a, index );
        return _e;
      }
    };
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

	


  @AnyLogicInternalCodegenAPI
  public void onBeforeStepEnvironment() {
    
timestep++;
CommunityTransmission = (double) selectFrom(incidence).where(incidence.step.eq(timestep)).uniqueResult(incidence.incidence)/(Adjusted*100000);
 
  }

  @AnyLogicInternalCodegenAPI
  public void onAfterStepEnvironment() {
    
//Routine testing of bank staff
if (timestep == TestON) {
	for (SharedStaff s:sharedStaffs) {
		if (s.inState(SharedStaff.Exposed) 
			|| s.inState(SharedStaff.Infectious)) {
				 if (randomTrue(PCRSens*PCRCompliance)) {
				 	s.Detected = true;
				 };
		};
	};
	TestReturn = TestON + TRT;
	TestON = TestON + TestInterval;
} else if (timestep == TestReturn) {
	for (SharedStaff s:sharedStaffs) {
		if (s.Detected) {
			s.Detected = false;
			s.Isolation = true;
		};
	};
};

//Shared Staff Infected & Reset
for (SharedStaff s:sharedStaffs) {
	if (s.WorkID > 0) {
		if (s.inState(SharedStaff.Susceptible)) {
			if (randomTrue(homes(s.WorkID-1).pInfectedByResidents)) {
				s.InfectionState.receiveMessage("Infect");
			} else
			if (randomTrue(homes(s.WorkID-1).pInfectedByStaff)) {
				s.InfectionState.receiveMessage("Infect");
			};
		};
		s.WorkID = 0;
	};	
};

sharedStaffs.onChange();
homes.onChange();
 
  }

  /**
   * Constructor
   */
  public Main( Engine engine, Agent owner, AgentList<? extends Main> ownerPopulation ) {
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
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main() {
  }
  
  /**
   * Simple constructor. Please add created agent to some population by calling goToPopulation() function
   */
  public Main( int TotalHomes, int k, int j, int p, double ContactRR, double ContactRS, double ContactSS, double pStaffSymp, double CommunityTransmission, int IsolationTime, int TotalSharedStaff, int NBubbles, int TotalAffectedHomes, double Usage, double PCRSens, int TestInterval, int TRT, double LFTSens, int t, double Turnover, double Adjusted, double pRule, double PCRCompliance, double shape1, double mean ) {
    markParametersAreSet();
    this.TotalHomes = TotalHomes;
    this.k = k;
    this.j = j;
    this.p = p;
    this.ContactRR = ContactRR;
    this.ContactRS = ContactRS;
    this.ContactSS = ContactSS;
    this.pStaffSymp = pStaffSymp;
    this.CommunityTransmission = CommunityTransmission;
    this.IsolationTime = IsolationTime;
    this.TotalSharedStaff = TotalSharedStaff;
    this.NBubbles = NBubbles;
    this.TotalAffectedHomes = TotalAffectedHomes;
    this.Usage = Usage;
    this.PCRSens = PCRSens;
    this.TestInterval = TestInterval;
    this.TRT = TRT;
    this.LFTSens = LFTSens;
    this.t = t;
    this.Turnover = Turnover;
    this.Adjusted = Adjusted;
    this.pRule = pRule;
    this.PCRCompliance = PCRCompliance;
    this.shape1 = shape1;
    this.mean = mean;
  }
  
  /**
   * Creating embedded object instances
   */
  @AnyLogicInternalCodegenAPI
  private void instantiatePopulations_xjal() {
    {
      int _cnt = 
TotalHomes 
;
      for ( int i = homes.size(); i < _cnt; i++ ) {
        instantiate_homes_xjal( i );
      }
    }
    {
      int _cnt = 
TotalSharedStaff 
;
      for ( int i = sharedStaffs.size(); i < _cnt; i++ ) {
        instantiate_sharedStaffs_xjal( i );
      }
    }
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doCreate() {
    super.doCreate();
    // Creating embedded object instances
    instantiatePopulations_xjal();
    // Assigning initial values for plain variables
    setupPlainVariables_Main_xjal();
    // Dynamic initialization of persistent elements
    _createPersistentElementsAP0_xjal();
	_initialize_level_xjal();
    level.initialize();
    presentation = new ShapeTopLevelPresentationGroup( Main.this, true, 0, 0, 0, 0 , level, homes_presentation, sharedStaffs_presentation );
    // Creating embedded object instances
    instantiatePopulations_xjal();
    icon = new ShapeModelElementsGroup( Main.this, getElementProperty( "hybridmodel.Main.icon", IElementDescriptor.MODEL_ELEMENT_DESCRIPTORS )  );
    icon.setIconOffsets( 0.0, 0.0 );
    // Environments setup
    {
      double _x_xjal = 
500 
;
      double _y_xjal = 
500 
;
      double _z_xjal = 
0 
;
      setupSpace( _x_xjal, _y_xjal, _z_xjal );
    }
    {
      double _v1_xjal;
      _v1_xjal = 
1.0 
;
      _v1_xjal = toModelTime( _v1_xjal, DAY );
      enableSteps( _v1_xjal );
    }
    setNetworkUserDefined();
    setLayoutType( LAYOUT_ARRANGED );
	 // Port connectors with non-replicated objects
    // Creating replicated embedded objects
    homes.setEnvironment( this );
    for ( int i = 0; i < homes.size(); i++ ) {
      Home _a = homes.get(i); 
      setupParameters_homes_xjal( _a, i, null );
      doBeforeCreate_homes_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    sharedStaffs.setEnvironment( this );
    for ( int i = 0; i < sharedStaffs.size(); i++ ) {
      SharedStaff _a = sharedStaffs.get(i); 
      setupParameters_sharedStaffs_xjal( _a, i, null );
      doBeforeCreate_sharedStaffs_xjal( _a, i, null );
      _a.createAsEmbedded();
    }
    setupInitialConditions_xjal( Main.class );
    // Dynamic initialization of persistent elements
    _createPersistentElementsBS0_xjal();
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public void doStart() {
    super.doStart();
    _CumInfectedResidents_autoUpdateEvent_xjal.start();
    _CumInfectedStaff_autoUpdateEvent_xjal.start();
    _CumDeaths_autoUpdateEvent_xjal.start();
    _TotalStaff_autoUpdateEvent_xjal.start();
    _TotalResidents_autoUpdateEvent_xjal.start();
    _InfectedBankStaff_autoUpdateEvent_xjal.start();
    _TotalStaffBank_autoUpdateEvent_xjal.start();
    _Prevalence_autoUpdateEvent_xjal.start();
    _InfectedResidentsDS_autoUpdateEvent_xjal.start();
    applyLayout();
    for (Agent embeddedObject : homes) {
      embeddedObject.startAsEmbedded();
    }
    for (Agent embeddedObject : sharedStaffs) {
      embeddedObject.startAsEmbedded();
    }
  }
 
  @AnyLogicInternalCodegenAPI
  public void onStartup() {
    super.onStartup();
    
//Impport details of care homes - size and total staff 
for (int i=0; i<TotalHomes; i++){
	homes(i).ID = i+1;
	homes(i).Nr = (int) selectFrom(a).where(a.id.eq(i+1)).uniqueResult(a.capacity);
	homes(i).Ns = (int) selectFrom(a).where(a.id.eq(i+1)).uniqueResult(a.nstaff);
	
	homes(i).Ns = (int) Math.round(homes(i).Ns*(1-Usage)/0.9);
	
	homes(i).Sr = homes(i).Nr;
	homes(i).Ss = homes(i).Ns;
	homes(i).TotalR = homes(i).Nr;
	homes(i).TotalS = homes(i).Ns;
};

//Allocate care homes into bubbles
int i=0;
Home h;
for (int i0 = 0; i0< TotalHomes; i0++) {
	i++;
	
	h = randomWhere(homes, p -> p.GroupID ==0);
	h.GroupID = i;
	
	NBub[i] = NBub[i] + h.Ns*h.Usage/(1-h.Usage);
	NShared = NShared + h.Ns*h.Usage/(1-h.Usage);
	
	if (i == NBubbles) {i = 0;};
};

// Allocate care homes into bubbles by their characteristic
/*int i = 0;
double BubbleSize = TotalHomes/NBubbles;
Home h; 

for (int i0=0; i0< NBubbles; i0++ ) {
	for (int j0=0; j0<BubbleSize; j0++) {
		h = homes(i);
		i++;
		h.GroupID = i0+1;
		NBub[i0+1] = NBub[i0+1] + h.Ns*h.Usage/(1-h.Usage);
		NShared = NShared + h.Ns*h.Usage/(1-h.Usage);
	};
};*/


//Allocate bank/agency staff into bubbles
double n = 0;
double r = 0;
for (i=1; i<=NBubbles; i++) {
	SharedStaff s;
	if (i < NBubbles) {
		n = Math.round(NBub[i]*TotalSharedStaff/NShared);
		r = r + n;
		
	} else {
		n = TotalSharedStaff - r; 
	};
	for (int count = 0; count < n; count++) {
		s = randomWhere(sharedStaffs, p -> p.GroupID == 0);
		if (s!= null) {s.GroupID = i;};
	};	
};
 
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  public void setupPlainVariables_xjal() {
    setupPlainVariables_Main_xjal();
  }

  /**
   * Assigning initial values for plain variables<br>
   * <em>This method isn't designed to be called by user and may be removed in future releases.</em>
   */
  @AnyLogicInternalCodegenAPI
  private void setupPlainVariables_Main_xjal() {
    CumInfectedBankStaff = 
0 
;
    TotalBankStaff = 
TotalSharedStaff 
;
    timestep = 
0 
;
    NBub = 
new double [NBubbles + 1] 
;
    NShared = 
0 
;
    TestON = 
1 
;
    TestReturn = 
2 
;
  }

  // User API -----------------------------------------------------
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

  public List<Object> getEmbeddedObjects() {
    List<Object> list = super.getEmbeddedObjects();
    if (list == null) {
      list = new LinkedList<Object>();
    }
    list.add( homes );
    list.add( sharedStaffs );
    return list;
  }

  public AgentList<? extends Main> getPopulation() {
    return (AgentList<? extends Main>) super.getPopulation();
  }

  public List<? extends Main> agentsInRange( double distance ) {
    return (List<? extends Main>) super.agentsInRange( distance );
  }

  @Override
  @AnyLogicInternalCodegenAPI
  public boolean isLoggingToDB(EventOriginator _e) {
    if ( _e == _CumInfectedResidents_autoUpdateEvent_xjal ) return false;
    if ( _e == _CumInfectedStaff_autoUpdateEvent_xjal ) return false;
    if ( _e == _CumDeaths_autoUpdateEvent_xjal ) return false;
    if ( _e == _TotalStaff_autoUpdateEvent_xjal ) return false;
    if ( _e == _TotalResidents_autoUpdateEvent_xjal ) return false;
    if ( _e == _InfectedBankStaff_autoUpdateEvent_xjal ) return false;
    if ( _e == _TotalStaffBank_autoUpdateEvent_xjal ) return false;
    if ( _e == _Prevalence_autoUpdateEvent_xjal ) return false;
    if ( _e == _InfectedResidentsDS_autoUpdateEvent_xjal ) return false;
    return super.isLoggingToDB( _e );
  }

  @AnyLogicInternalCodegenAPI
  public void onDestroy() {
    _CumInfectedResidents_autoUpdateEvent_xjal.onDestroy();
    _CumInfectedStaff_autoUpdateEvent_xjal.onDestroy();
    _CumDeaths_autoUpdateEvent_xjal.onDestroy();
    _TotalStaff_autoUpdateEvent_xjal.onDestroy();
    _TotalResidents_autoUpdateEvent_xjal.onDestroy();
    _InfectedBankStaff_autoUpdateEvent_xjal.onDestroy();
    _TotalStaffBank_autoUpdateEvent_xjal.onDestroy();
    _Prevalence_autoUpdateEvent_xjal.onDestroy();
    _InfectedResidentsDS_autoUpdateEvent_xjal.onDestroy();
    for (Agent _item : homes) {
      _item.onDestroy();
    }
    for (Agent _item : sharedStaffs) {
      _item.onDestroy();
    }
  // Analysis Data Elements
    CumInfectedResidents.destroyUpdater_xjal();
    CumInfectedStaff.destroyUpdater_xjal();
    CumDeaths.destroyUpdater_xjal();
    TotalStaff.destroyUpdater_xjal();
    TotalResidents.destroyUpdater_xjal();
    InfectedBankStaff.destroyUpdater_xjal();
    Outbreak.destroyUpdater_xjal();
    TotalStaffBank.destroyUpdater_xjal();
    AffectedHomes.destroyUpdater_xjal();
    Prevalence.destroyUpdater_xjal();
    InfectedResidentsDS.destroyUpdater_xjal();
    logToDB( CumInfectedResidents, "CumInfectedResidents" );
    logToDB( CumInfectedStaff, "CumInfectedStaff" );
    logToDB( CumDeaths, "CumDeaths" );
    logToDB( TotalStaff, "TotalStaff" );
    logToDB( TotalResidents, "TotalResidents" );
    logToDB( InfectedBankStaff, "InfectedBankStaff" );
    logToDB( Outbreak, "Outbreak" );
    logToDB( TotalStaffBank, "TotalStaffBank" );
    logToDB( AffectedHomes, "AffectedHomes" );
    super.onDestroy();
  }

  @AnyLogicInternalCodegenAPI
  @Override
  public void doFinish() {
    super.doFinish();
    for (Agent _item : homes) {
      _item.doFinish();
    }
    for (Agent _item : sharedStaffs) {
      _item.doFinish();
    }
  }



}
