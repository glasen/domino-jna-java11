package com.mindoo.domino.jna.errors.errortexts;

public interface IOsErr extends IGlobalErr {

	@ErrorText(text="Cannot restart as new user.  Please be sure the multi-user cleanup service has been installed and started.")
	short ERR_NTMULTI = PKG_OS;
	@ErrorText(text="Unknown OS error")
	short ERR_UNKNOWN = PKG_OS+1;
	@ErrorText(text="Cannot write or create file (file or disk is read-only)")
	short ERR_PROTECTED = PKG_OS+2;
	@ErrorText(text="File does not exist")
	short ERR_NOEXIST = PKG_OS+3;
	@ErrorText(text="File already exists")
	short ERR_EXISTS = PKG_OS+4;
	@ErrorText(text="Too many open files")
	short ERR_FILES = PKG_OS+5;
	@ErrorText(text="Insufficient disk space")
	short ERR_DISK = PKG_OS+6;
	@ErrorText(text="Insufficient memory.")
	short ERR_MEMORY = PKG_OS+7;
	@ErrorText(text="File cannot be created")
	short ERR_CREATE = PKG_OS+8;
	@ErrorText(text="File truncated - file may have been damaged")
	short ERR_TRUNC = PKG_OS+9;
	@ErrorText(text="too many file locks")
	short ERR_LOCKS = PKG_OS+10;
	@ErrorText(text="no more files to search")
	short ERR_NO_MORE_FILES = PKG_OS+11;
	@ErrorText(text="File is in use by another program")
	short ERR_LOCK = PKG_OS+12;
	@ErrorText(text="invalid file handle")
	short ERR_FD = PKG_OS+13;
	@ErrorText(text="I/O data error")
	short ERR_IOERROR = PKG_OS+14;
	@ErrorText(text="Drive is not ready")
	short ERR_DRIVE_NOT_READY = PKG_OS+15;
	@ErrorText(text="Access to data denied.")
	short ERR_ACCESS = PKG_OS+16;
	@ErrorText(text="Unable to access files directory")
	short ERR_PROGDIR = PKG_OS+17;
	@ErrorText(text="Invalid server or network name syntax")
	short ERR_INV_SERVER_NAME = PKG_OS+18;
	@ErrorText(text="File name too long or invalid file name syntax")
	short ERR_INV_FILE_NAME = PKG_OS+19;
	@ErrorText(text="Insufficient memory - local heap is full")
	short ERR_DS_MEMORY = PKG_OS+20;
	@ErrorText(text="RTVSCAN is operational and may be holding our memory, exiting.  Please restart RTVSCAN or reboot the system")
	short ERR_RTVSCAN_MEMORY = PKG_OS+21;
	@ErrorText(text="The CrashReporter will generate the crash log after you close this dialog. If you are going to send a bug report to IBM, be sure to include the CrashReporter log.")
	short ERR_FAULT_RECOVERY_CRASHREPORTER = PKG_OS+22;
	@ErrorText(text="The partition is terminating, new processes are not allowed to start as denoted by presence of termination file in the data directory")
	short ERR_TERMINATING = PKG_OS+23;
	@ErrorText(text="Insufficient memory to load the executable program library.")
	short ERR_LIBLOAD = PKG_OS+26;
	@ErrorText(text="Invalid character in file name")
	short ERR_PATHCHAR = PKG_OS+27;
	@ErrorText(text="Circular Directory Scan Reference")
	short ERR_CIRC_DIR = PKG_OS+32;
	@ErrorText(text="Operating System Time or Date is invalid!")
	short ERR_OSTIME = PKG_OS+33;
	@ErrorText(text="User information not available")
	short ERR_NO_USER = PKG_OS+34;
	@ErrorText(text="One moment, please...")
	short ERR_ONEMOMENT = PKG_OS+36;
	@ErrorText(text="(internal, used by message signal handler")
	short ERR_OSMESSAGE_OK = PKG_OS+39;
	@ErrorText(text="(internal, used by message signal handler")
	short ERR_OSMESSAGE_YES = PKG_OS+40;
	@ErrorText(text="(internal, used by message signal handler")
	short ERR_OSMESSAGE_NO = PKG_OS+41;
	@ErrorText(text="(internal, used by message signal handler")
	short ERR_OSMESSAGE_CANCEL = PKG_OS+42;
	@ErrorText(text="(internal, used by message signal handler")
	short ERR_OSMESSAGE_RETRY = PKG_OS+43;
	@ErrorText(text="Cannot write to file (possibly it is READ-ONLY or the disk is out of space or not ready)")
	short ERR_WRITETRUNC = PKG_OS+46;
	@ErrorText(text="Invalid quoted argument format")
	short ERR_BADQUOTE_FORMAT = PKG_OS+48;
	@ErrorText(text="CheckMarkers: Memory preceding object has been destroyed")
	short ERR_MARKERS_PRECEED = PKG_OS+50;
	@ErrorText(text="CheckMarkers: Memory following object has been destroyed")
	short ERR_MARKERS_FOLLOW = PKG_OS+51;
	@ErrorText(text="Invalid drive")
	short ERR_INVALID_DRIVE = PKG_OS+53;
	@ErrorText(text="LookupHandle: null handle")
	short ERR_OS_NULL_HANDLE = PKG_OS+54;
	@ErrorText(text="LookupHandle: handle out of range")
	short ERR_OS_HANDLE_RANGE = PKG_OS+55;
	@ErrorText(text="LookupHandle: handle not allocated")
	short ERR_OS_FREE_HANDLE = PKG_OS+56;
	@ErrorText(text="MemFree: object still locked")
	short ERR_OS_STILL_LOCKED = PKG_OS+57;
	@ErrorText(text="UnlockObject: already unlocked")
	short ERR_OS_ALREADY_UNLOCKED = PKG_OS+58;
	@ErrorText(text="Memory allocation request exceeded 65,000 bytes")
	short ERR_SEGMENT_TOO_BIG = PKG_OS+59;
	@ErrorText(text="Attempt to close file that still has accessors")
	short ERR_FILE_CLOSE_ACC = PKG_OS+60;
	@ErrorText(text="Cannot create thread")
	short ERR_THREAD_CREATE = PKG_OS+61;
	@ErrorText(text="Program library not loaded. Required .DLL missing or could not load.")
	short ERR_LIBLOAD2 = PKG_OS+64;
	@ErrorText(text="Launching the Domino setup wizard to setup your server...")
	short ERR_SETUP_NOT_DONE = PKG_OS+66;
	@ErrorText(text="Halt: ANOTHER process crashed (not this one). Report previous crash!")
	short ERR_MEMORY_WENT_AWAY = PKG_OS+67;
	@ErrorText(text="(internal, used by message signal handler")
	short ERR_OSMESSAGE_CANNOT_PROMPT = PKG_OS+70;
	@ErrorText(text="The executable program library cannot be found.")
	short ERR_LIBLOAD3 = PKG_OS+71;
	@ErrorText(text="Unable to locate program")
	short ERR_OS_EXECERRORNF = PKG_OS+73;
	@ErrorText(text="Unable to invoke program")
	short ERR_OS_EXECERROR = PKG_OS+74;
	@ErrorText(text="File name must be an absolute path")
	short ERR_OS_ABSOLUTE = PKG_OS+75;
	@ErrorText(text="Attempt to close a standard file descriptor")
	short ERR_OS_STD_CLOSE = PKG_OS+140;
	@ErrorText(text="Cannot prompt in this environment")
	short ERR_OS_NO_CONREAD = PKG_OS+141;
	@ErrorText(text="Handles are not compatible for operation")
	short ERR_OS_INCOMPATIBLE_HANDLES = PKG_OS+142;
	@ErrorText(text="(no error, initialize statics NOW)")
	short ERR_INITIALIZE_STATIC_MEM = PKG_OS+145;
	@ErrorText(text="OSTerm of a process with threads still active!")
	short ERR_THREADSLEFT = PKG_OS+146;
	@ErrorText(text="Attempt to close file that still has access refcnt")
	short ERR_FILE_CLOSE_REFCNT = PKG_OS+148;
	@ErrorText(text="Insufficient semaphores to handle number of concurrent owned critical regions")
	short ERR_OUTOFSEMS = PKG_OS+149;
	@ErrorText(text="Unable to perform control function on semaphore")
	short ERR_SEMCONTROL = PKG_OS+150;
	@ErrorText(text="Memory object cannot be accessed")
	short ERR_MEM_ACCESS = PKG_OS+151;
	@ErrorText(text="Insufficient file handles available to run program")
	short ERR_HANDLES = PKG_OS+152;
	@ErrorText(text="Insufficient room in poke buffer")
	short ERR_POKE_FULL = PKG_OS+153;
	@ErrorText(text="Poke buffer already contains characters")
	short ERR_POKE_NOT_EMPTY = PKG_OS+154;
	@ErrorText(text="semaphore invalid or not allocated")
	short ERR_OS_SEM_INVALID = PKG_OS+155;
	@ErrorText(text="Operation stopped at your request")
	short ERR_CANCEL = PKG_OS+157;
	@ErrorText(text="Someone else is running a different version of Notes right now.  You cannot run 2 different versions at the same time on the same machine.")
	short ERR_MM_MISMATCH = PKG_OS+158;
	@ErrorText(text="We've already been initialized via OSInit()")
	short ERR_NESTED_OSINIT = PKG_OS+159;
	@ErrorText(text="Too many concurrent users of the Notes API package.")
	short ERR_TOO_MANY_PROCESSES = PKG_OS+160;
	@ErrorText(text="Only one Notes-related program may be used on this computer at any given time.")
	short ERR_ONE_PROCESS = PKG_OS+161;
	@ErrorText(text="Maximum number of memory segments that Notes can support has been exceeded - out of handles")
	short ERR_MEM_HANDLES = PKG_OS+162;
	@ErrorText(text="Unable to launch program")
	short ERR_OS_LAUNCHFAIL = PKG_OS+163;
	@ErrorText(text="DEBUG_TRAPLEAKS: Could not add %s trace for %s because pool used for tracing is full. (%s=%s)")
	short ERR_LEAK_TRACING_POOL_FULL = PKG_OS+164;
	@ErrorText(text="The NOTES.INI / Notes Preferences file cannot be found.")
	short ERR_NO_NOTESINI = PKG_OS+165;
	@ErrorText(text="Invalid process group ID")
	short ERR_BAD_QUIT_PROCESS_GROUP = PKG_OS+169;
	@ErrorText(text="This port is currently in use by another process")
	short ERR_PORT_IN_USE = PKG_OS+170;
	@ErrorText(text="Communications port hardware is not configured or enabled")
	short ERR_PORT_NOT_CONFIGURED = PKG_OS+171;
	@ErrorText(text="Memory allocation request exceeded maximum HUGE allocation size")
	short ERR_SEGMENT_TOO_HUGE = PKG_OS+173;
	@ErrorText(text="Cannot access operating system semaphore that was created by another process")
	short ERR_SEMACCESS = PKG_OS+175;
	@ErrorText(text="Too many processes.  Exceeded maximum limit on static storage.")
	short ERR_STATIC_STORAGE = PKG_OS+176;
	@ErrorText(text="Cannot attach to shared memory region, due to insufficient access (probably owned by another user or group)")
	short ERR_CANNOT_ACCESS_SHMEM = PKG_OS+177;
	@ErrorText(text="Exceeded maximum limit of shared memory")
	short ERR_MAXDPOOLS_EXCEEDED = PKG_OS+178;
	@ErrorText(text="DEBUG_TRAPLEAKS: %d outstanding allocations of block type 0x%04X")
	short ERR_LEAK_TRACING_DDM = PKG_OS+179;
	@ErrorText(text="Too many THREAD termination handlers")
	short ERR_TTERM = PKG_OS+187;
	@ErrorText(text="There is not enough memory available to launch the application. To make more memory available, try quitting other open applications.")
	short ERR_OS_LAUNCHFAILMEM = PKG_OS+188;
	@ErrorText(text="Device is Busy/In Use")
	short ERR_BUSY = PKG_OS+189;
	@ErrorText(text="~notetmp.reg")
	short ERR_REGFILENAME = PKG_OS+190;
	@ErrorText(text="The Notes Data Directory is in use by another Notes program (possibly on another computer).  You must first shut down all Notes programs (for example, the Administration program) that share this Data Directory.")
	short ERR_NOTES_ALREADY_RUNNING = PKG_OS+191;
	@ErrorText(text="The caller's SemWait timeout expired.")
	short ERR_SEMTIMEOUT = PKG_OS+192;
	@ErrorText(text="Cannot load a needed string resource.")
	short ERR_CANNOT_LOAD_STRING = PKG_OS+193;
	@ErrorText(text="Cannot determine module handle for newly loaded library/program")
	short ERR_CANNOT_CLAIM_MODULE = PKG_OS+194;
	@ErrorText(text="Insufficient memory - Filename pool is full")
	short ERR_FILENAME_POOLFULL = PKG_OS+195;
	@ErrorText(text="%s changed to %s.")
	short ERR_ENV_CHANGE = PKG_OS+196;
	@ErrorText(text="%s changed to %s, and will be recognized when Notes is restarted.")
	short ERR_ENV_CHANGE_ON_RESTART = PKG_OS+197;
	@ErrorText(text="Insufficient memory - The NOTES.INI / Notes Preferences pool cache is full")
	short ERR_INICACHE_POOL_FULL = PKG_OS+199;
	@ErrorText(text="Insufficient memory - Static pool is full")
	short ERR_STATIC_POOLFULL = PKG_OS+200;
	@ErrorText(text="Cannot set file lock.  Access denied")
	short ERR_LOCK_FAILED = PKG_OS+202;
	@ErrorText(text="Cannot lock a remote mounted file because the nfs lock daemon is not responding")
	short ERR_NFSLOCKD_FAILED = PKG_OS+203;
	@ErrorText(text="An attempt to lock a semaphore has bounced.")
	short ERR_SEM_LOCK_BOUNCED = PKG_OS+205;
	@ErrorText(text="The server and file name specified exceeds 256 characters.")
	short ERR_PATH_NAME_TOO_LONG = PKG_OS+206;
	@ErrorText(text="Cannot perform this action because the file is locked. Unlock the file using the Finder's Get Info command.")
	short ERR_MAC_FINDER_LOCKED = PKG_OS+207;
	@ErrorText(text="Process group termination is currently suppressed")
	short ERR_GROUP_QUIT_SUPPRESSED = PKG_OS+208;
	@ErrorText(text="Insufficient memory - Sem Waiter pool is full")
	short ERR_SEMWAITER_POOLFULL = PKG_OS+209;
	@ErrorText(text="Asynchronous IO event is not complete")
	short ERR_IO_COMPLETE = PKG_OS+214;
	@ErrorText(text="No asynchronous IO operation is in progress")
	short ERR_NO_ASYNC_DATA = PKG_OS+215;
	@ErrorText(text="Asynchronous IO is in progress")
	short ERR_IO_PENDING = PKG_OS+216;
	@ErrorText(text="Unexpected result from asynchronous IO wait")
	short ERR_ASYNCIO_WAIT = PKG_OS+217;
	@ErrorText(text="Net user account could not be deleted for %s")
	short ERR_DELETE_USER = PKG_OS+218;
	@ErrorText(text="You must be a Windows NT or 2000 Administrator or Account Operator to delete or rename Windows users.")
	short ERR_NT_ACCESS_DENIED = PKG_OS+219 ;
	@ErrorText(text="Windows user accounts cannot be deleted or renamed.  A primary domain controller for the current Windows domain cannot be found.")
	short ERR_NT_DC_NOT_FOUND = PKG_OS+220;
	@ErrorText(text="Netapi32.dll (Windows NT) or nadreg.dll (Windows 2000 or higher) could not be found.")
	short ERR_NT_DLL_NOT_FOUND = PKG_OS+221;
	@ErrorText(text="Windows account for '%s' not deleted or renamed.  The Windows user or Windows group could not be found on the current Windows domain.")
	short ERR_NT_USER_GROUP_ABSENT = PKG_OS+222;
	@ErrorText(text="Windows user '%s' could not be deleted or renamed.")
	short ERR_NT_MODIFY_FAILED = PKG_OS+223;
	@ErrorText(text="This function is not supported on this operating system.")
	short ERR_NOT_SUPPORTED = PKG_OS+224;
	@ErrorText(text="Trying to create more pipes than the notes system limit.")
	short ERR_TOO_MANY_PIPES = PKG_OS+225;
	@ErrorText(text="ospipe api function timed out.")
	short ERR_OSPIPE_TIMEOUT = PKG_OS+226;
	@ErrorText(text="The feature you have chosen is not available in this version of Notes.")
	short ERR_WEB_DOWNLOAD_PROMPT = PKG_OS+227;
	@ErrorText(text="Attempt to extend file past supported size for platform.")
	short ERR_FILE_TOO_LARGE = PKG_OS+231;
	@ErrorText(text="~notetp2.reg")
	short ERR_REGFILENAME2 = PKG_OS+232;
	@ErrorText(text="Insufficient memory - OSMemAlloc BPOOL is full")
	short ERR_MEMALLOC_BPOOL_POOLFULL = PKG_OS+235;
	@ErrorText(text="Unable to register directory link %s. Directory link %s for path %s already exists. Please remove one of the duplicate links.")
	short ERR_DUPLICATE_DIRLINK = PKG_OS+236;
	@ErrorText(text="Do not run Domino as root.  Domino exiting\n")
	short ERR_USER_ROOT = PKG_OS+237;
	@ErrorText(text="Warning!! Current file descriptor limit %d is too low.|Refer to System Requirements documentation.")
	short ERR_SYSREQ = PKG_OS+238;
	@ErrorText(text="Fault cleanup is in progress|Termination is in progress|Too many crashes, restart disabled|Running cleanup script|Terminating tasks|Warning! Failed to allocate message queue resource; post-crash/fault recovery shutdown system disabled.")
	short ERR_FAULT_RECOVERY1 = PKG_OS+239;
	@ErrorText(text="Freeing resources|Recovery error|Fault cleanup completed|Termination completed|Domino Halted. Type 'quit' to Terminate/Cleanup |quit|Shutdown system disabled, use 'nsd -kill' to terminate|NSD completed|Show in Finder|Error removing .terminating file")
	short ERR_FAULT_RECOVERY2 = PKG_OS+240;
	@ErrorText(text="Server Restart Notification|Fault Recovery Notification: Server %s was restarted after a fault on %s|Running NSD|NSD is collecting crash information, please wait...|NSD has completed. Log has been written to|NSD has completed, but it encountered an error.")
	short ERR_FAULT_RECOVERY3 = PKG_OS+241;
	@ErrorText(text="ospipe read would block, pipe is empty.")
	short ERR_OSPIPE_READ_WOULDBLOCK = PKG_OS+242	/* from 4.61 */;
	@ErrorText(text="Invalid directory name or device not ready.")
	short ERR_BAD_DIRECTORY = PKG_OS+243;
	@ErrorText(text="Restart the server")
	short ERR_SERVER_RESTART = PKG_OS+244;
	@ErrorText(text="Cannot attach to shared memory region.  Region was deallocated due to abnormal termination of another process.")
	short ERR_SHMEM_NOT_FOUND = PKG_OS+245;
	@ErrorText(text="stack walk failed")
	short ERR_STACKWALK_FAILED = PKG_OS+246;
	@ErrorText(text="Folder is not empty")
	short ERR_DIR_NOT_EMPTY = PKG_OS+247;
	@ErrorText(text="This link points within the existing data directory tree")
	short ERR_CANNOT_LINK_TO_DATADIR = PKG_OS+248;
	@ErrorText(text="Destination path does not exist")
	short ERR_LINK_DEST_NO_EXIST = PKG_OS+249;
	@ErrorText(text="Insufficient memory.")
	short ERR_SERVER_MEMORY = PKG_OS+250;
	@ErrorText(text="(internal, used by message signal handler")
	short ERR_OSMESSAGE_IGNORE = PKG_OS+251;
	@ErrorText(text="(internal, used by message signal handler")
	short ERR_OSMESSAGE_ABORT = PKG_OS+252;
	@ErrorText(text="The specified path is invalid")
	short ERR_BAD_PATH = PKG_OS+253;
	@ErrorText(text="File is not a link")
	short ERR_FILE_NOT_LINK = PKG_OS+255;

}
