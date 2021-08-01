package com.mindoo.domino.jna.errors.errortexts;

public interface ISrvErr extends IGlobalErr {

	@ErrorText(text="You are not authorized to access the specified directory")
	short ERR_NO_DIR_ACCESS = PKG_SERVER;
	@ErrorText(text="You are not authorized to use the server on this port")
	short ERR_NO_SERVER_ACCESS_PORT = PKG_SERVER+3;
	@ErrorText(text="Pathname cannot be an absolute pathname")
	short ERR_ABSOLUTE_PATH = PKG_SERVER+4;
	@ErrorText(text="A transient network error or network adapter failure has truncated a message from a client.  If it recurs, run the appropriate adapter diagnostics.")
	short ERR_CL_MSG_TOO_SMALL = PKG_SERVER+6;
	@ErrorText(text="This message does not conform to server's protocol requirements.  Client and server may be running incompatible versions of the product")
	short ERR_PROTOCOL = PKG_SERVER+8;
	@ErrorText(text="Command or option is ambiguous")
	short ERR_AMBIGUOUS = PKG_SERVER+9;
	@ErrorText(text="Service not available (unknown service type)")
	short ERR_UNKNOWN_SVCTYPE = PKG_SERVER+10;
	@ErrorText(text="Invalid value for command option")
	short ERR_VALUE = PKG_SERVER+11;
	@ErrorText(text="Server and client are running different versions of the product.  Install the same version on all communicating servers and workstations.")
	short ERR_VERSION_MISMATCH = PKG_SERVER+12;
	@ErrorText(text="No such task in server")
	short ERR_SRV_NO_SUCH_TASK = PKG_SERVER+13;
	@ErrorText(text="Invalid task priority")
	short ERR_INV_PRIORITY = PKG_SERVER+14;
	@ErrorText(text="Invalid task scheduler state")
	short ERR_INV_SCHED_STATE = PKG_SERVER+15;
	@ErrorText(text="Variables block already allocated")
	short ERR_VAR_BLOCK_ALLOC = PKG_SERVER+16;
	@ErrorText(text="Insufficient arguments.  Enter 'HELP' for the correct syntax.")
	short ERR_INSUFF_ARGUMENTS = PKG_SERVER+17;
	@ErrorText(text="Can't perform this operation on running task")
	short ERR_RUNNING_TASK = PKG_SERVER+18;
	@ErrorText(text="Command or option is not recognized")
	short ERR_NOMATCH = PKG_SERVER+19;
	@ErrorText(text="No more items")
	short ERR_NO_MORE = PKG_SERVER+20;
	@ErrorText(text="Need send buffer")
	short ERR_NEED_SEND_BFR = PKG_SERVER+21;
	@ErrorText(text="Need receive buffer")
	short ERR_NEED_RCV_BFR = PKG_SERVER+22;
	@ErrorText(text="No such database open on server")
	short ERR_NO_OPEN_DB = PKG_SERVER+23;
	@ErrorText(text="The requested function is not supported by the software on this server.")
	short ERR_FUNC_NOT_IMPL = PKG_SERVER+24;
	@ErrorText(text="Error in server buffer management")
	short ERR_BFR_MGMT = PKG_SERVER+25;
	@ErrorText(text="Data Directory cannot be accessed.  Check the path given in the DIRECTORY= line in your NOTES.INI file.")
	short ERR_PROGRAM_DIR = PKG_SERVER+26;
	@ErrorText(text="Waiting for processes to exit")
	short ERR_TASK_REMAINING = PKG_SERVER+27;
	@ErrorText(text="Service type already in use")
	short ERR_SVC_IN_USE = PKG_SERVER+28;
	@ErrorText(text="The server's full text indexer is too busy right now to accept this request")
	short ERR_FT_TOO_BUSY = PKG_SERVER+29;
	@ErrorText(text="No such collection open on server")
	short ERR_NO_OPEN_COLLECTION = PKG_SERVER+30;
	@ErrorText(text="Subprogram terminated")
	short ERR_SUBPGM_TERM = PKG_SERVER+31;
	@ErrorText(text="(Waiting for request)")
	short ERR_WAIT_FOR_RQST = PKG_SERVER+32;
	@ErrorText(text="Buffer Manager Cleaner Thread")
	short ERR_TASK_DESC_UBM_CLEANER_THREAD = PKG_SERVER+33;
	@ErrorText(text="Wait for external event to complete")
	short ERR_WAIT_EXTERNAL_EVENT = PKG_SERVER+36;
	@ErrorText(text="Requesting system's ID is the same as the server's ID.  You cannot use the same ID on two systems.")
	short ERR_SAME_LICENSE = PKG_SERVER+37;
	@ErrorText(text="(function completed, no error)")
	short ERR_COMPLETED = PKG_SERVER+38;
	@ErrorText(text="(Yield and need send buffer)")
	short ERR_YIELD_NEED_SEND_BFR = PKG_SERVER+39;
	@ErrorText(text="Workstation's license is invalid or unknown")
	short ERR_LICENSE_INVALID = PKG_SERVER+40;
	@ErrorText(text="Your license is in use by another user")
	short ERR_LICENSE_IN_USE = PKG_SERVER+41;
	@ErrorText(text="Server Task executable file was not found.  Check that it exists in your program directory.")
	short ERR_TASK_NOT_FOUND = PKG_SERVER+42;
	@ErrorText(text="At least one network port requires the Domino Server to be restricted to a single process, and that process has exceeded the maximum number of threads.")
	short ERR_CANNOT_MULTISERVER = PKG_SERVER+43;
	@ErrorText(text="Task is already running")
	short ERR_TASK_RUNNING = PKG_SERVER+44;
	@ErrorText(text="You are not authorized to use the server")
	short ERR_NO_SERVER_ACCESS = PKG_SERVER+46;
	@ErrorText(text="Server is already running (in another process)")
	short ERR_SERVER_RUNNING = PKG_SERVER+47;
	@ErrorText(text="Server exiting:")
	short ERR_STARTING_SERVER = PKG_SERVER+48;
	@ErrorText(text="(wait for network I/O)")
	short ERR_WAIT_NETIO = PKG_SERVER+49;
	@ErrorText(text="(wait for final network I/O)")
	short ERR_FINAL_WAIT_NETIO = PKG_SERVER+50;
	@ErrorText(text="(function is complete)")
	short ERR_FUNCTION_COMPLETE = PKG_SERVER+51;
	@ErrorText(text="Partition %s is already in use.")
	short ERR_PARTITIONSERVER_RUNNING = PKG_SERVER+52;
	@ErrorText(text="Internal software problem.  Call Customer Support.")
	short ERR_SERVER_BUG = PKG_SERVER+53;
	@ErrorText(text="IBM Domino Server")
	short ERR_TITLE = PKG_SERVER+55;
	@ErrorText(text="The Domino Directory does not contain a server document for this server")
	short ERR_NO_SERVER_NAME = PKG_SERVER+56;
	@ErrorText(text="Server document in Domino Directory does not contain a network name (or one for this port)")
	short ERR_NO_NETWORK_NAME = PKG_SERVER+57;
	@ErrorText(text="Begin scan of databases to be consistency checked")
	short ERR_FIXUP_BEGIN = PKG_SERVER+58;
	@ErrorText(text="End scan of databases: %d found")
	short ERR_FIXUP_END = PKG_SERVER+59;
	@ErrorText(text="Too many users for the Demo and Evaluation version of the server")
	short ERR_TOO_MANY_TASKS_DE = PKG_SERVER+60;
	@ErrorText(text="The command line is too long")
	short ERR_CMD_LINE_TOO_LONG = PKG_SERVER+61;
	@ErrorText(text="Error checking database %p")
	short ERR_FIXUP_ERR = PKG_SERVER+63;
	@ErrorText(text="Replicator task not running%n")
	short ERR_CONSOLE_NO_REPLICATOR = PKG_SERVER+97;
	@ErrorText(text="Router task not running%n")
	short ERR_CONSOLE_NO_ROUTER = PKG_SERVER+98;
	@ErrorText(text="The %s task either does not exist or does not accept \"Tell\" commands.%n")
	short ERR_CONSOLE_CANT_TELL = PKG_SERVER+99;
	@ErrorText(text="Wrong number of parameters%n")
	short ERR_CONSOLE_BAD_NO_OF_PARMS = PKG_SERVER+102;
	@ErrorText(text="Error attempting to load or run %s:%n    %e%n")
	short ERR_INIT_CANT_LOAD = PKG_SERVER+110;
	@ErrorText(text="You are not authorized to perform this function on this server")
	short ERR_SERVER_NOT_AUTH = PKG_SERVER+175;
	@ErrorText(text="This server is not configured for that function")
	short ERR_SERVER_NOT_CONFIG = PKG_SERVER+176;
	@ErrorText(text="You are not authorized to use the remote console on this server")
	short ERR_NO_REMOTE_CONSOLE_ACCESS = PKG_SERVER+177;
	@ErrorText(text="Server is not responding to remote console commands (try again later)")
	short ERR_SERVER_NOT_RESP = PKG_SERVER+178;
	@ErrorText(text="No response from server for this command")
	short ERR_SERVER_NO_RESPONSE = PKG_SERVER+179;
	@ErrorText(text="Incorrect console security password")
	short ERR_CON_PASS = PKG_SERVER+180;
	@ErrorText(text="This command is not permitted when console security is in effect")
	short ERR_CMD_SECURE = PKG_SERVER+183;
	@ErrorText(text="Server entry in Name & Address database does not contain any information for port %s")
	short ERR_NO_NA_PORT_NAME = PKG_SERVER+186;
	@ErrorText(text="In order to run the Domino Server, you must first use a text editor to edit your Windows SYSTEM.INI file.")
	short ERR_NETHEAPSIZE = PKG_SERVER+188;
	@ErrorText(text="In the [386Enh] section, add: NetHeapSize=%d")
	short ERR_NETHEAPSIZE_0 = PKG_SERVER+189;
	@ErrorText(text="In the [386Enh] section, change the line reading 'NetHeapSize=%d' to 'NetHeapSize=%d'")
	short ERR_NETHEAPSIZE_N = PKG_SERVER+190;
	@ErrorText(text="Error reading server information for name server")
	short ERR_NAMESERVER_TABLES_ERR = PKG_SERVER+191;
	@ErrorText(text="This server requires a console password. Enter Exit [password] or Quit [password].")
	short ERR_CMD_QUIT_NEEDS_PASSWORD = PKG_SERVER+192;
	@ErrorText(text="Replication requests are disabled")
	short ERR_SRV_NO_REPL_REQ = PKG_SERVER+193;
	@ErrorText(text="Command has been executed on remote server. Use 'Live' console option, in future, to view response from server.")
	short ERR_USE_LIVE_CONSOLE = PKG_SERVER+195;
	@ErrorText(text="Server not setup")
	short ERR_SRV_SETUP = PKG_SERVER+196;
	@ErrorText(text="This server is not permitted to passthru to the specified server")
	short ERR_NO_PRIV_PASSTHRU_TARGET = PKG_SERVER+198;
	@ErrorText(text="The port is not connected to a server, and you are not allowed to make a call on that port")
	short ERR_NO_PRIV_PASSTHRU_CALLING = PKG_SERVER+199;
	@ErrorText(text="You are not allowed to use passthru to access this server")
	short ERR_NO_PRIV_PASSTHRU_ACCESS = PKG_SERVER+200;
	@ErrorText(text="(authentication message)")
	short ERR_AUTHENTICATION_MESSAGE = PKG_SERVER+201;
	@ErrorText(text="Completing Domino server setup")
	short ERR_SRV_SETUP_COMPLETE = PKG_SERVER+202;
	@ErrorText(text="Dialing server ")
	short ERR_SRV_SETUP_DIALING = PKG_SERVER+203;
	@ErrorText(text="Getting server ID from Domino Directory on ")
	short ERR_SRV_SETUP_GET_ID_ADDR = PKG_SERVER+204;
	@ErrorText(text="Replicating system databases from ")
	short ERR_SRV_SETUP_REPL_ADDR = PKG_SERVER+205;
	@ErrorText(text="Creating Domino Directory connection entry on ")
	short ERR_SRV_SETUP_REG_ADDR = PKG_SERVER+206;
	@ErrorText(text="Deleting Server ID from Domino Directory on ")
	short ERR_SRV_SETUP_DEL_ID = PKG_SERVER+207;
	@ErrorText(text="Deleted Server ID from Domino Directory on ")
	short ERR_SRV_SETUP_DEL_ID_OK = PKG_SERVER+208;
	@ErrorText(text="Domino server setup completed")
	short ERR_SRV_SETUP_DONE = PKG_SERVER+209;
	@ErrorText(text="Insufficient access to delete Server ID from Domino Directory on ")
	short ERR_SRV_SETUP_DEL_ID_NOACCESS = PKG_SERVER+210;
	@ErrorText(text="Error while deleting Server ID from Domino Directory on %a.%nERROR: %e%nServer ID NOT deleted from Domino Directory.")
	short ERR_SRV_SETUP_DEL_ID_ERROR = PKG_SERVER+211;
	@ErrorText(text="You are not allowed to route through this server")
	short ERR_NO_PRIV_PASSTHRU_CLIENT = PKG_SERVER+212;
	@ErrorText(text="Error during service control setup")
	short ERR_SVC_CTRL_ERROR = PKG_SERVER+214;
	@ErrorText(text="Access denied during service control setup")
	short ERR_SVC_ACCESS_DENIED = PKG_SERVER+215;
	@ErrorText(text="The Domino Server service already exists in the registry")
	short ERR_SVC_ALREADY_EXISTS = PKG_SERVER+216;
	@ErrorText(text="The Domino Server service does not exist in the registry")
	short ERR_SVC_DOES_NOT_EXIST = PKG_SERVER+217;
	@ErrorText(text="Insufficient memory - server executive pool is full.")
	short ERR_EXEC_POOLFULL = PKG_SERVER+218;
	@ErrorText(text="Access to this server has been restricted due to excessive load")
	short ERR_SERVER_BUSY = PKG_SERVER+222;
	@ErrorText(text="Access to this server has been restricted due to excessive load")
	short ERR_SERVER_UNAVAILABLE = ERR_SERVER_BUSY;
	@ErrorText(text="Server has no information for database")
	short ERR_SERVER_REPID_NOT_FOUND = PKG_SERVER+223;
	@ErrorText(text="Error receiving data from workstation")
	short ERR_RECEIVED_DATA = PKG_SERVER+237;
	@ErrorText(text="Error searching Server Configuration document - it will not be updated with '%s'")
	short ERR_SERVERCONFIG_SETINFO = PKG_SERVER+238;
	@ErrorText(text="Access to the database has been restricted by the administrator")
	short ERR_DATABASE_UNAVAILABLE = PKG_SERVER+239;
	@ErrorText(text="This server is not configured for a cluster.")
	short ERR_CLUSTER_NOT_CONFIG = PKG_SERVER+250;
	@ErrorText(text="The specified file name conflicts with another database which you can not delete")
	short ERR_FILENAME_CONFLICT = PKG_SERVER+251;
	@ErrorText(text="Access to this server has been restricted by the administrator")
	short ERR_SERVER_RESTRICTED = PKG_SERVER+252;
	@ErrorText(text="Informational: The registry value HKEY_LOCAL_MACHINE\\%s is currently set to %d. For better server performance, change the setting to %d")
	short ERR_BAD_NTREGISTRY_VALUE = PKG_SERVER+253;
	@ErrorText(text="No events are scheduled at this time.%n%n")
	short ERR_NO_EVENT_SCHEDULED = PKG_SERVER2+1;
	@ErrorText(text="Consistency check will start in %d seconds")
	short ERR_FIXUP_DELAY = PKG_SERVER2+2;
	@ErrorText(text="START")
	short ERR_CMD_CMD_START = PKG_SERVER2+11;
	@ErrorText(text="STOP")
	short ERR_CMD_CMD_STOP = PKG_SERVER2+17;
	@ErrorText(text="This server is not currently a member of a cluster")
	short ERR_NOT_IN_CLUSTER = PKG_SERVER2+18;
	@ErrorText(text="Starts the specified port")
	short ERR_HELP_CMD_START = PKG_SERVER2+19;
	@ErrorText(text="Stops the specified port")
	short ERR_HELP_CMD_STOP = PKG_SERVER2+20;
	@ErrorText(text="Error reading server access restriction list")
	short ERR_SERVER_ACCESS_LIST = PKG_SERVER2+21;
	@ErrorText(text="Access to the server is restricted due to maximum number of users.")
	short ERR_SERVER_MAXUSERS = PKG_SERVER2+24;
	@ErrorText(text="Error replicating Domino Directory and cluster database directory to another cluster member.  Please replicate manually.")
	short ERR_CLU_NOREP = PKG_SERVER2+26;
	@ErrorText(text="Error adding server to cluster:  cluster database directory found on system")
	short ERR_CLU_CLDBDIR_EXISTS = PKG_SERVER2+27;
	@ErrorText(text="Requested operation is unavailable on this platform.")
	short ERR_INVALID_OPERATION = PKG_SERVER2+35;
	@ErrorText(text="Client password checking has been enabled for this server but will be ignored because the server is not running with a hierarchical name")
	short ERR_SERVER_CHECKPW_MUST_BE_HI = PKG_SERVER2+42;
	@ErrorText(text="You are not allowed to perform this operation with Anonymous access")
	short ERR_NO_ANON_ACCESS = PKG_SERVER2+45;
	@ErrorText(text="PORT portname")
	short ERR_CMD_STARTSTOP_PORT = PKG_SERVER3+3;
	@ErrorText(text="SERVER [password]")
	short ERR_CMD_RESTART_SERVER = PKG_SERVER3+4;
	@ErrorText(text="Error loading remote addresses ")
	short ERR_RA_LOAD_TABLE_ERROR = PKG_SERVER3+7;
	@ErrorText(text="An error was encountered while loading remote addresses%n")
	short ERR_RA_LOAD_TABLE_GENERIC = PKG_SERVER3+8;
	@ErrorText(text="Statistic not found on server %a")
	short ERR_NO_STAT = (PKG_SERVER3+9);
	@ErrorText(text="Could not get statistics from server %a")
	short ERR_STAT_SERVER_ACCESS = (PKG_SERVER3+10);
	@ErrorText(text="Message tracking is not available on this server")
	short ERR_MT_NOT_RUNNING = PKG_SERVER3+11;
	@ErrorText(text="Client version not supported by server at this time - please use newer client")
	short ERR_CLIENT_TOO_OLD = PKG_SERVER3+16;
	@ErrorText(text="Unable to verify server document network info")
	short ERR_CHECK_NETINFO_ERROR = PKG_SERVER3+20;
	@ErrorText(text="WARNING: Unable to locate a server document for this server - %a")
	short ERR_NO_SERVER_DOC = PKG_SERVER4;
	@ErrorText(text="Activity logging failed to initialize")
	short ERR_SRV_ACTIVITY_INIT_FAILED = PKG_SERVER5+3;
	@ErrorText(text="Unable to find port %s")
	short ERR_SRV_UNABLE_TO_FIND_PORT = PKG_SERVER5+10;
	@ErrorText(text="You are not authorized to use this remote console command on this server")
	short ERR_VIEW_ONLY_CONSOLE_ACCESS = PKG_SERVER5+11;
	@ErrorText(text="This server is not currently a member of a cluster")
	short ERR_CLU_NOT_IN_CLUSTER = PKG_SERVER6+3;
	@ErrorText(text="Cannot perform operation.  No other cluster members available")
	short ERR_CLU_NO_MATES_AVAIL = PKG_SERVER6+4;
	@ErrorText(text="No instance of the cluster directory was updated in the cluster.")
	short ERR_CLU_NO_UPDATE = PKG_SERVER6+5;
	@ErrorText(text="Error deleting cluster database directory.  Please remove manually.")
	short ERR_CLU_NODEL_CLDBDIR = PKG_SERVER6+6;
	@ErrorText(text="This server is currently a member of a cluster")
	short ERR_CLU_IN_CLUSTER = PKG_SERVER6+7;
	@ErrorText(text="Error adding or removing server from cluster (Domino Enterprise or Utility server is required for cluster support)")
	short ERR_CLADMIN_REQUEST = PKG_SERVER6+8;
	@ErrorText(text="Error")
	short ERR_VDIR_STS_ERROR = PKG_SERVER6+13;
	@ErrorText(text="Cluster Replicator is not replicating all databases")
	short ERR_CLREPL_MEMORY = PKG_SERVER6+14;
	@ErrorText(text="Unable to restart %s%n")
	short ERR_RESTART_FAILED_ERR = PKG_SERVER6+27;
	@ErrorText(text="Waiting %d seconds to restart %s...%n")
	short ERR_RESTARTING_TASK = PKG_SERVER6+28;
	@ErrorText(text="Member of cluster:	%s\n")
	short ERR_CLUSTER_NAME = PKG_SERVER6+29;
	@ErrorText(text="Agent Manager not loaded, no agent schedule available.\n")
	short ERR_NOAGENT_SCHEDULE = PKG_SERVER6+30;
	@ErrorText(text="NOTES.INI may be damaged or read-only.  Non-zero values for 'ServerSetup' and 'KitType' were not found.")
	short ERR_INVALID_NOTESINI = PKG_SERVER6+32;
	@ErrorText(text="%s: %s is over the %d second '%s' threshold %s")
	short ERR_TOOK_N_SECS = PKG_SERVER6+42;
	@ErrorText(text="The DB2 user password will expire today. If the password expires, all DB2-based NSF databases will become inaccessible.")
	short ERR_DB2_PW_EXPIRATION_TODAY = PKG_SERVER6+43;
	@ErrorText(text="Could not retrieve DB2 Access version. Please make sure DB2 Access is updated to the latest version.")
	short ERR_DB2_OLD_UDF_VER = PKG_SERVER6+47;
	@ErrorText(text="Binary copy can't be done for database with external storage.")
	short ERR_EXTERNAL_STORAGE = PKG_SERVER6+52;
	@ErrorText(text="Binary copy can't be done for database with reader's list.")
	short ERR_HAS_NAMES_LIST = PKG_SERVER6+53;
	@ErrorText(text="Binary copy can't be done for database with low space usage.")
	short ERR_LOW_SPACE_USE = PKG_SERVER6+54;
	@ErrorText(text="NOTES.INI contains the following %s parameters:\n")
	short ERR_DEBUG_VARS1 = PKG_SERVER7+1;
	@ErrorText(text="Warning: Debug parameters could impact operation or performance.\n")
	short ERR_DEBUG_VARS2 = PKG_SERVER7+2;
	@ErrorText(text="Contact your appropriate support vendor.\n")
	short ERR_DEBUG_VARS3 = PKG_SERVER7+3;
	@ErrorText(text="Domino Controller is running or died abnormally leaving lock file (in latter case, delete .jsc_lock in data directory and run).")
	short ERR_START_CONTROLLER = PKG_SERVER7+4;
	@ErrorText(text="Domino Controller is not currently running in this data directory.")
	short ERR_QUIT_CONTROLLER = PKG_SERVER7+5;
	@ErrorText(text="The version of this client is below the minimum level required to access the server")
	short ERR_CLIENT_VERSION_TOO_LOW = PKG_SERVER7+20;
	@ErrorText(text="The version of this client is above the maximum level allowed to access the server")
	short ERR_CLIENT_VERSION_TOO_HIGH = PKG_SERVER7+21;
	@ErrorText(text="%a was denied full administrator access.")
	short ERR_FULL_ADMIN_DENIED = PKG_SERVER7+24;
	@ErrorText(text="%a was granted full administrator access.")
	short ERR_FULL_ADMIN_ALLOWED = PKG_SERVER7+25;
	@ErrorText(text="Unable to retrieve activity trends configuration.")
	short ERR_ATC_CONFIG_CHECK = PKG_SERVER7+26;
	@ErrorText(text="Remote live console task on %s")
	short ERR_TASK_DESC_LIVE_CONSOLE_THREAD = PKG_SERVER7+27;
	@ErrorText(text="This system variable cannot be set via the server console. You must edit NOTES.INI to set this variable.")
	short ERR_UNSETTABLE_VARIABLE = PKG_SERVER7+28;
	@ErrorText(text="CONSOLELOG")
	short ERR_CMD_STARTSTOP_CONLOG = PKG_SERVER7+30;
	@ErrorText(text="You need Admin Access to run this transaction")
	short ERR_NEED_ADMIN_ACCESS = PKG_SERVER7+45;
	@ErrorText(text="(wait for user event)")
	short ERR_WAIT_FOR_USER_EVENT = PKG_SERVER7+46;
	@ErrorText(text="Could not access ID on server")
	short ERR_SERVER_ID_ACCESS = PKG_SERVER7+59;
	@ErrorText(text="The number of pending mail messages on %a has exceeded the allowed limit.")
	short ERR_MAIL_PENDING_EXCEEDED = PKG_SERVER7+60;
	@ErrorText(text="The Smart Upgrade database %s on %a has exceeded the %d maximum number of kits supported.")
	short ERR_SERVER_SU_MAXIMUM_KITS = PKG_SERVER7+61;
	@ErrorText(text="The RMEval task could not be loaded.")
	short ERR_RMEVAL_NOT_LOADED = PKG_SERVER7+62;
	@ErrorText(text="Tell RMEval %s failed.")
	short ERR_RMEVAL_TELL = PKG_SERVER7+63;
	@ErrorText(text="Server Process terminated abnormally")
	short ERR_PROCMON_ABNORMALTERM = PKG_SERVER7+66;
	@ErrorText(text="Process %s (%d/0x%x) has terminated abnormally")
	short ERR_PROCMON_PROCMISSING = PKG_SERVER7+67;
	@ErrorText(text="Mail from %a to destination %a has exceeded its message limit.")
	short ERR_DESTINATION_MSG_LIMIT_REACHED = PKG_SERVER7+68;
	@ErrorText(text="Mail from %a to destination %a is under its message limit.")
	short STR_DESTINATION_MSG_LIMIT_OK = PKG_SERVER7+69;
	@ErrorText(text="Mail from %a to destination %a has exceeded its retry limit.")
	short ERR_DESTINATION_RETRY_LIMIT_REACHED = PKG_SERVER7+70;
	@ErrorText(text="Mail from %a to destination %a is under its retry limit.")
	short STR_DESTINATION_RETRY_LIMIT_OK = PKG_SERVER7+71;
	@ErrorText(text="Mail from %a to destination %a has exceeded multiple limits.")
	short ERR_DESTINATION_LIMITS_REACHED = PKG_SERVER7+72;
	@ErrorText(text="Mail from %a to destination %a is under all configured limits.")
	short STR_DESTINATION_LIMITS_OK = PKG_SERVER7+73;
	@ErrorText(text="The number of pending mail messages on %a is at a healthy level.")
	short ERR_MAIL_PENDING_HEALTHY = PKG_SERVER7+74;
	@ErrorText(text="STOP")
	short ERR_CMD_DB2_STOP = PKG_SERVER7+82;
	@ErrorText(text="You are not listed as a trusted server")
	short ERR_FAILED_TRUSTED_SERVER = PKG_SERVER7+83			;
	@ErrorText(text="Could not allocate DB2 container name block.")
	short ERR_HELP_DB2_CONT_ALLOC = PKG_SERVER7+84;
	@ErrorText(text="RnR cache node not found")
	short ERR_RNR_NODE_NOT_FOUND = PKG_SERVER7+85;
	@ErrorText(text="Server RnR Busytime Cache is full")
	short ERR_SRV_RNRBTCACHE_FULL = PKG_SERVER7+86;
	@ErrorText(text="Too many users are upgrading from this server.  Try again later.")
	short ERR_SU_OVERLIMIT = PKG_SERVER7+91;
	@ErrorText(text="A NULL names list was generated for %a")
	short ERR_NULL_NAMESLIST = PKG_SERVER7+92;
	@ErrorText(text="Too many server names in this domain, %d servers processed out of %d")
	short ERR_TOO_MANY_SERVERS = PKG_SERVER7+96;
	@ErrorText(text="System time too far in the future, not resetting to System time.")
	short ERR_SYSTEMTIME_TOOFAR = PKG_SERVER_STR+55;
	@ErrorText(text="Platform Stats: error")
	short ERR_PERFSTAT_GENERROR = (PKG_PERFSTAT+10);
	@ErrorText(text="Platform Stats: Unable to read initialization file %s")
	short ERR_PERFSTAT_INITREAD = (PKG_PERFSTAT+11);
	@ErrorText(text="Platform Stats: Using default counters and update interval.")
	short MSG_PERFSTAT_CMDDEFAULT = (PKG_PERFSTAT+12);
	@ErrorText(text="Platform Stats: PSCounterList VPool is full.")
	short ERR_PERFSTAT_PSCLPOOLFULL = (PKG_PERFSTAT+13);
	@ErrorText(text="Platform Stats: Unable to set up performance counters.")
	short ERR_PERFSTAT_CNTRINIT = (PKG_PERFSTAT+14);
	@ErrorText(text="Platform Stats: Unable to update performance counters.")
	short ERR_PERFSTAT_CNTRUPDATE = (PKG_PERFSTAT+15);
	@ErrorText(text="Platform Stats: Unable to create counter %s of context %s.")
	short ERR_PERFSTAT_CREATECNTR = (PKG_PERFSTAT+16);
	@ErrorText(text="Platform Stats: Update interval is already set to %s.")
	short ERR_PERFSTAT_INTRVLSET = (PKG_PERFSTAT+17);
	@ErrorText(text="Platform Stats: Update Interval command is incomplete.")
	short ERR_PERFSTAT_INTRVLINC = (PKG_PERFSTAT+18);
	@ErrorText(text="Platform Stats: Invalid Update Interval specified %s. Must be an integer between 1 and %s.")
	short ERR_PERFSTAT_INTRVLBAD = (PKG_PERFSTAT+19);
	@ErrorText(text="Platform Stats: %s is not a valid instance of %s.")
	short ERR_PERFSTAT_NOTINST = (PKG_PERFSTAT+20);
	@ErrorText(text="Platform Stats: %s is not a valid statistic of %s.")
	short ERR_PERFSTAT_NOTSTAT = (PKG_PERFSTAT+21);
	@ErrorText(text="Platform Stats: Unable to monitor statistic %s of context %s.")
	short ERR_PERFSTAT_NONODE = (PKG_PERFSTAT+22);
	@ErrorText(text="Platform Stats: Unknown command starting with: %s.")
	short ERR_PERFSTAT_UNKWNCMD = (PKG_PERFSTAT+23);
	@ErrorText(text="Platform Stats: Unknown operation: %s.")
	short ERR_PERFSTAT_UNKNWNOPER = (PKG_PERFSTAT+24);
	@ErrorText(text="Platform Stats: Unable to add to Platform Statistics name table.")
	short ERR_PERFSTAT_NTPOOLFULL = (PKG_PERFSTAT+25);
	@ErrorText(text="Unable to create pool for PerfList")
	short ERR_PL_POOLFULL = (PKG_PERFSTAT+31);
	@ErrorText(text="Platform Stats: Please check that the Registry Key HKEY_LOCAL_MACHINE\\SYSTEM\\CurrentControlSet\\Services\\notestat\\Performance\\Library is set to NNOTES.DLL, including the path to your Domino server executable directory.")
	short ERR_REG_KEY_NOT_SET = PKG_PLAT_STAT_ERR;
	@ErrorText(text="Platform Stats: Notes DLL directory is different from executable directory.\n Edit the following Registry setting to conform to the server being run.\nHKEY_LOCAL_MACHINE\\SYSTEM\\ControlSet\\Services\\notestat\\Performance\\Library")
	short ERR_DLL_DIR_NOT_SAME_AS_EXE = PKG_PLAT_STAT_ERR+1;
	@ErrorText(text="Platform Stats: Please see online help to enable SNMP service in order to monitor network performance.")
	short ERR_NETWRK_CNTRS_NOT_ENABLED = PKG_PLAT_STAT_ERR+2;
	@ErrorText(text="Platform Stats: Please run 'diskperf.exe -y' to enable Logical Disk performance counters.")
	short ERR_DISK_CNTRS_NOT_ENABLED = PKG_PLAT_STAT_ERR+3;
	@ErrorText(text="Platform Stats: Unable to obtain performance data. Please check Microsoft MSDN on how to enable performance data collection.")
	short ERR_WIN2K_IMPROPER_INSTALL = PKG_PLAT_STAT_ERR+4;
	@ErrorText(text="Platform Stats: Unable to allocate memory for process stats.")
	short ERR_PROCSTAT_MEM = PKG_PLAT_STAT_ERR+5;
	@ErrorText(text="Platform Stats: File I/O error.")
	short ERR_PROCSTAT_FILE = PKG_PLAT_STAT_ERR+6;
	@ErrorText(text="Platform Stats: Unable to obtain process data.")
	short ERR_PROCSTAT_GET_PROC = PKG_PLAT_STAT_ERR+7;
	@ErrorText(text="Platform Stats: Bad counter value generated.")
	short ERR_BAD_COUNTER_VALUE = PKG_PLAT_STAT_ERR+11;
	@ErrorText(text="Platform Stats: cannot access z/OS module ERBSMFI; unable to obtain SMF data.")
	short ERR_ZOS_SMF_UNAVAIL = PKG_PLAT_STAT_ERR+12;

}
