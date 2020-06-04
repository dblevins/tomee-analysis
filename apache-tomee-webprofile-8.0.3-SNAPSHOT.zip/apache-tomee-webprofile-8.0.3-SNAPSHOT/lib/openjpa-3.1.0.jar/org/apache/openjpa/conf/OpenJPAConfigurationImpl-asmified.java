package asm.org.apache.openjpa.conf;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Attribute;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.ConstantDynamic;
import org.objectweb.asm.FieldVisitor;
import org.objectweb.asm.Handle;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.RecordComponentVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.TypePath;
public class OpenJPAConfigurationImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", null, "org/apache/openjpa/lib/conf/ConfigurationImpl", new String[] { "org/apache/openjpa/conf/OpenJPAConfiguration" });

classWriter.visitInnerClass("org/apache/openjpa/conf/DetachOptions$Loaded", "org/apache/openjpa/conf/DetachOptions", "Loaded", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/conf/DetachOptions$FetchGroups", "org/apache/openjpa/conf/DetachOptions", "FetchGroups", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/openjpa/conf/DetachOptions$All", "org/apache/openjpa/conf/DetachOptions", "All", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "metaRepository", "Lorg/apache/openjpa/meta/MetaDataRepository;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PROTECTED, "remoteEventManager", "Lorg/apache/openjpa/event/RemoteCommitEventManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "brokerPlugin", "Lorg/apache/openjpa/conf/BrokerValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dataCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "auditorPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dataCacheTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "queryCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dynamicDataStructs", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "transactionMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "fetchBatchSize", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "maxFetchDepth", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "fetchGroups", "Lorg/apache/openjpa/lib/conf/StringListValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "lockTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "queryTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "filterListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "aggregateListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "retryClassRegistration", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionUserName", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionPassword", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "encryptionProvider", "Lorg/apache/openjpa/lib/conf/PluginValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionURL", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionDriverName", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionFactoryName", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionProperties", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionFactoryProperties", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionFactoryMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connection2UserName", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connection2Password", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connection2URL", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connection2DriverName", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connection2Properties", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionFactory2", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionFactory2Name", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "connectionFactory2Properties", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "optimistic", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "retainState", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "ignoreChanges", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "nontransactionalRead", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "nontransactionalWrite", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "refreshFromDataCache", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "multithreaded", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "mapping", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "metaFactoryPlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "metaRepositoryPlugin", "Lorg/apache/openjpa/conf/MetaDataRepositoryValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "inverseManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "queryCompilationCachePlugin", "Lorg/apache/openjpa/conf/QueryCompilationCacheValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "cacheMarshallerPlugins", "Lorg/apache/openjpa/conf/CacheMarshallersValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "eagerInitialization", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "preparedQueryCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "finderCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "specification", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "validationMode", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "validationFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "validator", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "validationGroupPrePersist", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "validationGroupPreUpdate", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "validationGroupPreRemove", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dataCacheMode", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dynamicEnhancementAgent", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "postLoadOnMerge", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "optimizeIdCopy", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "useTcclForSelectNew", "Lorg/apache/openjpa/lib/conf/BooleanValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "databaseAction", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "scriptsAction", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "createSource", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dropSource", "Lorg/apache/openjpa/lib/conf/IntValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "createScriptSource", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dropScriptSource", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "createScriptTarget", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "dropScriptTarget", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "loadScriptSource", "Lorg/apache/openjpa/lib/conf/StringValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "brokerFactoryPlugin", "Lorg/apache/openjpa/conf/BrokerFactoryValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "remoteProviderPlugin", "Lorg/apache/openjpa/conf/RemoteCommitProviderValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC, "autoDetach", "Lorg/apache/openjpa/conf/AutoDetachValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "supportedOptions", "Ljava/util/Collection;", "Ljava/util/Collection<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_storeFacadeRegistry", "Lorg/apache/openjpa/util/StoreFacadeTypeRegistry;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_brokerFactoryEventManager", "Lorg/apache/openjpa/event/BrokerFactoryEventManager;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_peMap", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_allowSetLifeCycleEventManager", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "<init>", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "<init>", "(ZZ)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(ZZ)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/conf/ConfigurationImpl", "<init>", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepository", "Lorg/apache/openjpa/meta/MetaDataRepository;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteEventManager", "Lorg/apache/openjpa/event/RemoteCommitEventManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/HashSet");
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 33);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashSet", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/StoreFacadeTypeRegistry");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/StoreFacadeTypeRegistry", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "_storeFacadeRegistry", "Lorg/apache/openjpa/util/StoreFacadeTypeRegistry;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/event/BrokerFactoryEventManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/event/BrokerFactoryEventManager", "<init>", "(Lorg/apache/openjpa/lib/conf/Configuration;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "_brokerFactoryEventManager", "Lorg/apache/openjpa/event/BrokerFactoryEventManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "_allowSetLifeCycleEventManager", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ClassResolver");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("org.apache.openjpa.util.ClassResolverImpl");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("spec");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("org.apache.openjpa.util.ClassResolverImpl");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getClassResolverInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/conf/BrokerFactoryValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/BrokerFactoryValue", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "brokerFactoryPlugin", "Lorg/apache/openjpa/conf/BrokerFactoryValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "brokerFactoryPlugin", "Lorg/apache/openjpa/conf/BrokerFactoryValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addValue", "(Lorg/apache/openjpa/lib/conf/Value;)Lorg/apache/openjpa/lib/conf/Value;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/conf/BrokerValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/BrokerValue", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "brokerPlugin", "Lorg/apache/openjpa/conf/BrokerValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "brokerPlugin", "Lorg/apache/openjpa/conf/BrokerValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addValue", "(Lorg/apache/openjpa/lib/conf/Value;)Lorg/apache/openjpa/lib/conf/Value;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DataCacheManager");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/datacache/DataCacheManagerImpl;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getDataCacheManager");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("CacheDistributionPolicy");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("org.apache.openjpa.datacache.DefaultCacheDistributionPolicy");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("type-based");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("org.apache.openjpa.datacache.TypeBasedCacheDistributionPolicy");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getCacheDistributionPolicy");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DataCache");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/datacache/ConcurrentDataCache;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("concurrent");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/datacache/ConcurrentDataCache;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("partitioned");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/datacache/PartitionedDataCache;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DataCacheTimeout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitLdcInsn("-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDynamic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("QueryCache");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/datacache/ConcurrentQueryCache;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("concurrent");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/datacache/ConcurrentQueryCache;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RefreshFromDataCache");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "refreshFromDataCache", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "refreshFromDataCache", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "refreshFromDataCache", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "refreshFromDataCache", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDynamic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DynamicDataStructs");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicDataStructs", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicDataStructs", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicDataStructs", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LockManager");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("org.apache.openjpa.kernel.NoneLockManager");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("version");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("org.apache.openjpa.kernel.VersionLockManager");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("InverseManager");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "inverseManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("org.apache.openjpa.kernel.InverseManager");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "inverseManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "inverseManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "inverseManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("SavepointManager");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("in-mem");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("org.apache.openjpa.kernel.InMemorySavepointManager");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getSavepointManagerInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("OrphanedKeyAction");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("log");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("org.apache.openjpa.event.LogOrphanedKeyAction");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("exception");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("org.apache.openjpa.event.ExceptionOrphanedKeyAction");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("org.apache.openjpa.event.NoneOrphanedKeyAction");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getOrphanedKeyActionInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/conf/RemoteCommitProviderValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/RemoteCommitProviderValue", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteProviderPlugin", "Lorg/apache/openjpa/conf/RemoteCommitProviderValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteProviderPlugin", "Lorg/apache/openjpa/conf/RemoteCommitProviderValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addValue", "(Lorg/apache/openjpa/lib/conf/Value;)Lorg/apache/openjpa/lib/conf/Value;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("TransactionMode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "transactionMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("local");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("managed");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "transactionMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "transactionMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ManagedRuntime");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("auto");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("org.apache.openjpa.ee.AutomaticManagedRuntime");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("jndi");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("org.apache.openjpa.ee.JNDIManagedRuntime");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("invocation");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("org.apache.openjpa.ee.InvocationManagedRuntime");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getManagedRuntimeInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ProxyManager");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("org.apache.openjpa.util.ProxyManagerImpl");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getProxyManagerInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Mapping");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "mapping", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("MetaDataFactory");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaFactoryPlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/conf/MetaDataRepositoryValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/MetaDataRepositoryValue", "<init>", "()V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addValue", "(Lorg/apache/openjpa/lib/conf/Value;)Lorg/apache/openjpa/lib/conf/Value;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/conf/MetaDataRepositoryValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepositoryPlugin", "Lorg/apache/openjpa/conf/MetaDataRepositoryValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionFactory");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addObject", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/ObjectValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getConnectionFactory");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionFactory2");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addObject", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/ObjectValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getConnectionFactory2");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDynamic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDynamic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionUserName");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionUserName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionUserName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitLdcInsn("javax.persistence.jdbc.user");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "addEquivalentKey", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionPassword");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionPassword", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionPassword", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitLdcInsn("javax.persistence.jdbc.password");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "addEquivalentKey", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionPassword", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "hide", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("EncryptionProvider");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "encryptionProvider", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionURL");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionURL", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionURL", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitLdcInsn("javax.persistence.jdbc.url");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "addEquivalentKey", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionDriverName");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionDriverName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionDriverName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitLdcInsn("javax.persistence.jdbc.driver");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "addEquivalentKey", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionFactoryName");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionProperties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionProperties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionFactoryProperties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryProperties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Connection2UserName");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2UserName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Connection2Password");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2Password", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2Password", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "hide", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Connection2URL");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2URL", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Connection2DriverName");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2DriverName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Connection2Properties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2Properties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionFactory2Properties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2Properties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionFactory2Name");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2Name", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionFactoryMode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("local");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("managed");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Optimistic");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimistic", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimistic", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimistic", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("PostLoadOnMerge");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "postLoadOnMerge", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "postLoadOnMerge", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "postLoadOnMerge", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("OptimizeIdCopy");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimizeIdCopy", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimizeIdCopy", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimizeIdCopy", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.schema-generation.database.action");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "databaseAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("create");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("drop-and-create");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("drop");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "databaseAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "databaseAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "databaseAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.schema-generation.scripts.action");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "scriptsAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("create");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("drop-and-create");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("drop");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "scriptsAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "scriptsAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "scriptsAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.schema-generation.create-source");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("metadata");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("script");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("metadata-then-script");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("script-then-metadata");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.schema-generation.drop-source");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("metadata");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("script");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("metadata-then-script");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("script-then-metadata");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.schema-generation.create-script-source");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createScriptSource", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.schema-generation.drop-script-source");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropScriptSource", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.schema-generation.scripts.create-target");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createScriptTarget", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.schema-generation.scripts.drop-target");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropScriptTarget", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.sql-load-script-source");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addString", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "loadScriptSource", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("AutoClear");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("datastore");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("all");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RetainState");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "retainState", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "retainState", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "retainState", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RestoreState");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("immutable");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitLdcInsn("all");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/conf/AutoDetachValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/AutoDetachValue", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoDetach", "Lorg/apache/openjpa/conf/AutoDetachValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoDetach", "Lorg/apache/openjpa/conf/AutoDetachValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addValue", "(Lorg/apache/openjpa/lib/conf/Value;)Lorg/apache/openjpa/lib/conf/Value;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DetachState");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("loaded");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/conf/DetachOptions$Loaded;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("fgs");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/conf/DetachOptions$FetchGroups;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("fetch-groups");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/conf/DetachOptions$FetchGroups;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("all");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/conf/DetachOptions$All;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getDetachStateInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("IgnoreChanges");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "ignoreChanges", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NontransactionalRead");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "nontransactionalRead", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "nontransactionalRead", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "nontransactionalRead", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("NontransactionalWrite");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "nontransactionalWrite", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Multithreaded");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "multithreaded", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("FetchBatchSize");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchBatchSize", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchBatchSize", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitLdcInsn("-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchBatchSize", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchBatchSize", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDynamic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("MaxFetchDepth");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "maxFetchDepth", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "maxFetchDepth", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitLdcInsn("-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "maxFetchDepth", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_M1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("FetchGroups");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addStringList", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/StringListValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchGroups", "Lorg/apache/openjpa/lib/conf/StringListValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchGroups", "Lorg/apache/openjpa/lib/conf/StringListValue;");
methodVisitor.visitLdcInsn("default");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringListValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchGroups", "Lorg/apache/openjpa/lib/conf/StringListValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringListValue", "set", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("FlushBeforeQueries");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("false");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("with-connection");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LockTimeout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitLdcInsn("javax.persistence.lock.timeout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "addEquivalentKey", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitLdcInsn("-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDynamic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ReadLockLevel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("read");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("write");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("WriteLockLevel");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("read");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("write");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("none");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 20);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/conf/SeqValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("Sequence");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/SeqValue", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getSequenceInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addValue", "(Lorg/apache/openjpa/lib/conf/Value;)Lorg/apache/openjpa/lib/conf/Value;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("ConnectionRetainMode");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("on-demand");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("transaction");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("always");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitLdcInsn("persistence-manager");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("FilterListeners");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPluginList", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/PluginListValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "filterListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "filterListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitLdcInsn("getFilterListenerInstances");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("AggregateListeners");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPluginList", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/PluginListValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "aggregateListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "aggregateListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitLdcInsn("getAggregateListenerInstances");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RetryClassRegistration");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "retryClassRegistration", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Compatibility");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/conf/Compatibility;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getCompatibilityInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Callbacks");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/conf/CallbackOptions;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getCallbackOptionsInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/conf/QueryCompilationCacheValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("QueryCompilationCache");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/QueryCompilationCacheValue", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCompilationCachePlugin", "Lorg/apache/openjpa/conf/QueryCompilationCacheValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCompilationCachePlugin", "Lorg/apache/openjpa/conf/QueryCompilationCacheValue;");
methodVisitor.visitLdcInsn("getQueryCompilationCacheInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/QueryCompilationCacheValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCompilationCachePlugin", "Lorg/apache/openjpa/conf/QueryCompilationCacheValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addValue", "(Lorg/apache/openjpa/lib/conf/Value;)Lorg/apache/openjpa/lib/conf/Value;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("RuntimeUnenhancedClasses");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("supported");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("unsupported");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("warn");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/String", "valueOf", "(I)Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitLdcInsn("unsupported");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitLdcInsn("unsupported");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setAliasListComprehensive", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/conf/CacheMarshallersValue");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/CacheMarshallersValue", "<init>", "(Lorg/apache/openjpa/lib/conf/Configuration;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addValue", "(Lorg/apache/openjpa/lib/conf/Value;)Lorg/apache/openjpa/lib/conf/Value;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/conf/CacheMarshallersValue");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheMarshallerPlugins", "Lorg/apache/openjpa/conf/CacheMarshallersValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("InitializeEagerly");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "eagerInitialization", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/conf/SpecificationPlugin");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Specification");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/SpecificationPlugin", "<init>", "(Lorg/apache/openjpa/lib/conf/Configuration;Ljava/lang/String;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "specification", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "specification", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addValue", "(Lorg/apache/openjpa/lib/conf/Value;)Lorg/apache/openjpa/lib/conf/Value;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "specification", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getSpecificationInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("javax.persistence.query.timeout");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addInt", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/IntValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitLdcInsn("-1");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setDynamic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("LifecycleEventManager");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/event/LifecycleEventManager;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("validating");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/validation/ValidatingLifecycleEventManager;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getLifecycleEventManagerInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("DynamicEnhancementAgent");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicEnhancementAgent", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicEnhancementAgent", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitLdcInsn("true");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicEnhancementAgent", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("InstrumentationManager");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/instrumentation/InstrumentationManagerImpl;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getInstrumentationManager");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Instrumentation");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPluginList", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/PluginListValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("jmx");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("org.apache.openjpa.instrumentation.jmx.JMXProvider");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitLdcInsn("getInstrumentationInstances");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("Auditor");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addPlugin", "(Ljava/lang/String;Z)Lorg/apache/openjpa/lib/conf/PluginValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "auditorPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("default");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/audit/AuditLogger;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "auditorPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setAliases", "([Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "auditorPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn("getAuditorInstance");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setInstantiatingGetter", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("UseTCCLinSelectNew");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "addBoolean", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/conf/BooleanValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "useTcclForSelectNew", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "useTcclForSelectNew", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitLdcInsn("false");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setDefault", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "useTcclForSelectNew", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.NontransactionalRead");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.Optimistic");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.ApplicationIdentity");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.DatastoreIdentity");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.Collection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.Map");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.Array");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.NullContainer");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.EmbeddedRelation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.EmbeddedCollectionRelation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.EmbeddedMapRelation");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.IncrementalFlush");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.AutoassignValue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.IncrementValue");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.DataStoreConnection");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.PostLoadOnMerge");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitLdcInsn("openjpa.option.UseTCCLinSelectNew");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Collection", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/conf/ProductDerivations", "beforeConfigurationLoad", "(Lorg/apache/openjpa/lib/conf/Configuration;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {"org/apache/openjpa/conf/OpenJPAConfigurationImpl", Opcodes.INTEGER, Opcodes.INTEGER, "[Ljava/lang/String;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ILOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "loadGlobals", "()Z", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "supportedOptions", "()Ljava/util/Collection;", "()Ljava/util/Collection<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "supportedOptions", "Ljava/util/Collection;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSpecification", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getSpecificationInstance", "()Lorg/apache/openjpa/conf/Specification;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitLdcInsn("");
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/conf/Specification"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/Specification", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/String"});
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSpecificationInstance", "()Lorg/apache/openjpa/conf/Specification;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "specification", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/conf/Specification");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSpecification", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "specification", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSpecification", "(Lorg/apache/openjpa/conf/Specification;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "specification", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClassResolver", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassResolver", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setClassResolver", "(Lorg/apache/openjpa/util/ClassResolver;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getClassResolverInstance", "()Lorg/apache/openjpa/util/ClassResolver;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/util/ClassResolver;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "classResolverPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/util/ClassResolver");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBrokerFactory", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "brokerFactoryPlugin", "Lorg/apache/openjpa/conf/BrokerFactoryValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/BrokerFactoryValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBrokerFactory", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "brokerFactoryPlugin", "Lorg/apache/openjpa/conf/BrokerFactoryValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/BrokerFactoryValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setBrokerImpl", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "brokerPlugin", "Lorg/apache/openjpa/conf/BrokerValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/BrokerValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBrokerImpl", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "brokerPlugin", "Lorg/apache/openjpa/conf/BrokerValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/BrokerValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newBrokerInstance", "(Ljava/lang/String;Ljava/lang/String;)Lorg/apache/openjpa/kernel/BrokerImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "brokerPlugin", "Lorg/apache/openjpa/conf/BrokerValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/BrokerImpl;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/BrokerValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/BrokerImpl");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/kernel/BrokerImpl", "setAuthentication", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/kernel/BrokerImpl"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataCacheManager", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataCacheManager", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataCacheManager", "(Lorg/apache/openjpa/datacache/DataCacheManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/datacache/DataCacheManager", "initialize", "(Lorg/apache/openjpa/conf/OpenJPAConfiguration;Lorg/apache/openjpa/lib/conf/ObjectValue;Lorg/apache/openjpa/lib/conf/ObjectValue;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataCacheManagerInstance", "()Lorg/apache/openjpa/datacache/DataCacheManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/datacache/DataCacheManager");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/datacache/DataCacheManager;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/datacache/DataCacheManager");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/datacache/DataCacheManager", "initialize", "(Lorg/apache/openjpa/conf/OpenJPAConfiguration;Lorg/apache/openjpa/lib/conf/ObjectValue;Lorg/apache/openjpa/lib/conf/ObjectValue;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/datacache/DataCacheManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataCache", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataCache", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataCacheTimeout", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataCacheTimeout", "(Ljava/lang/Integer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setDataCacheTimeout", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataCacheTimeout", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQueryCache", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueryCache", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCachePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRefreshFromDataCache", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "refreshFromDataCache", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRefreshFromDataCache", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "refreshFromDataCache", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRefreshFromDataCache", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "refreshFromDataCache", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDynamicDataStructs", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicDataStructs", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDynamicDataStructs", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicDataStructs", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDynamicDataStructs", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setDynamicDataStructs", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLockManager", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLockManager", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newLockManagerInstance", "()Lorg/apache/openjpa/kernel/LockManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/LockManager;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;Z)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/LockManager");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInverseManager", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "inverseManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInverseManager", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "inverseManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newInverseManagerInstance", "()Lorg/apache/openjpa/kernel/InverseManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "inverseManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/InverseManager;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/InverseManager");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSavepointManager", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSavepointManager", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSavepointManagerInstance", "()Lorg/apache/openjpa/kernel/SavepointManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/SavepointManager;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "savepointManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/SavepointManager");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOrphanedKeyAction", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrphanedKeyAction", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOrphanedKeyActionInstance", "()Lorg/apache/openjpa/event/OrphanedKeyAction;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/event/OrphanedKeyAction;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/event/OrphanedKeyAction");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOrphanedKeyAction", "(Lorg/apache/openjpa/event/OrphanedKeyAction;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "orphanedKeyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRemoteCommitProvider", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteProviderPlugin", "Lorg/apache/openjpa/conf/RemoteCommitProviderValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/RemoteCommitProviderValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRemoteCommitProvider", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteProviderPlugin", "Lorg/apache/openjpa/conf/RemoteCommitProviderValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/RemoteCommitProviderValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newRemoteCommitProviderInstance", "()Lorg/apache/openjpa/event/RemoteCommitProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteProviderPlugin", "Lorg/apache/openjpa/conf/RemoteCommitProviderValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/RemoteCommitProviderValue", "instantiateProvider", "(Lorg/apache/openjpa/lib/conf/Configuration;)Lorg/apache/openjpa/event/RemoteCommitProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRemoteCommitEventManager", "(Lorg/apache/openjpa/event/RemoteCommitEventManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteEventManager", "Lorg/apache/openjpa/event/RemoteCommitEventManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteProviderPlugin", "Lorg/apache/openjpa/conf/RemoteCommitProviderValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/RemoteCommitProviderValue", "configureEventManager", "(Lorg/apache/openjpa/event/RemoteCommitEventManager;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRemoteCommitEventManager", "()Lorg/apache/openjpa/event/RemoteCommitEventManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteEventManager", "Lorg/apache/openjpa/event/RemoteCommitEventManager;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/event/RemoteCommitEventManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/event/RemoteCommitEventManager", "<init>", "(Lorg/apache/openjpa/conf/OpenJPAConfiguration;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteEventManager", "Lorg/apache/openjpa/event/RemoteCommitEventManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteProviderPlugin", "Lorg/apache/openjpa/conf/RemoteCommitProviderValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteEventManager", "Lorg/apache/openjpa/event/RemoteCommitEventManager;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/RemoteCommitProviderValue", "configureEventManager", "(Lorg/apache/openjpa/event/RemoteCommitEventManager;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteEventManager", "Lorg/apache/openjpa/event/RemoteCommitEventManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionMode", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "transactionMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getTransactionMode", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "transactionMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setTransactionModeManaged", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "transactionMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isTransactionModeManaged", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "transactionMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setManagedRuntime", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getManagedRuntime", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setManagedRuntime", "(Lorg/apache/openjpa/ee/ManagedRuntime;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getManagedRuntimeInstance", "()Lorg/apache/openjpa/ee/ManagedRuntime;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/ee/ManagedRuntime;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "managedRuntimePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/ee/ManagedRuntime");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProxyManager", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProxyManager", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setProxyManager", "(Lorg/apache/openjpa/util/ProxyManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getProxyManagerInstance", "()Lorg/apache/openjpa/util/ProxyManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/util/ProxyManager;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "proxyManagerPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/util/ProxyManager");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMapping", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "mapping", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMapping", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "mapping", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMetaDataFactory", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaFactoryPlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetaDataFactory", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaFactoryPlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newMetaDataFactoryInstance", "()Lorg/apache/openjpa/meta/MetaDataFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaFactoryPlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/meta/MetaDataFactory;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/meta/MetaDataFactory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMetaDataRepository", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepositoryPlugin", "Lorg/apache/openjpa/conf/MetaDataRepositoryValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/MetaDataRepositoryValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetaDataRepository", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepositoryPlugin", "Lorg/apache/openjpa/conf/MetaDataRepositoryValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/MetaDataRepositoryValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMetaDataRepository", "(Lorg/apache/openjpa/meta/MetaDataRepository;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepository", "Lorg/apache/openjpa/meta/MetaDataRepository;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMetaDataRepositoryInstance", "()Lorg/apache/openjpa/meta/MetaDataRepository;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepository", "Lorg/apache/openjpa/meta/MetaDataRepository;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "newMetaDataRepositoryInstance", "()Lorg/apache/openjpa/meta/MetaDataRepository;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepository", "Lorg/apache/openjpa/meta/MetaDataRepository;");
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepository", "Lorg/apache/openjpa/meta/MetaDataRepository;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "metaDataRepositoryAvailable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepository", "Lorg/apache/openjpa/meta/MetaDataRepository;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "newMetaDataRepositoryInstance", "()Lorg/apache/openjpa/meta/MetaDataRepository;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepositoryPlugin", "Lorg/apache/openjpa/conf/MetaDataRepositoryValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/meta/MetaDataRepository;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/MetaDataRepositoryValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/meta/MetaDataRepository");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionUserName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionUserName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionUserName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionUserName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionPassword", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionPassword", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionPassword", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getEncryptionProvider", "()Lorg/apache/openjpa/lib/encryption/EncryptionProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionPassword", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/encryption/EncryptionProvider", "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/lib/encryption/EncryptionProvider"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionPassword", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionURL", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionURL", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionURL", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionURL", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionDriverName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionDriverName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionDriverName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionDriverName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionProperties", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionProperties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionProperties", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionProperties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionFactoryProperties", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryProperties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionFactoryProperties", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryProperties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionFactoryMode", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionFactoryMode", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isConnectionFactoryModeManaged", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionFactoryModeManaged", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryMode", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionFactoryName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionFactoryName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactoryName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionFactory", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionFactory", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getConnectionFactoryName", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getProperty", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lookupConnectionFactory", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "lookupConnectionFactory", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Exception");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/StringUtil", "trimToNull", "(Ljava/lang/String;)Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("openjpa.Runtime");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getLog", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/log/Log;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/conf/Configurations", "lookup", "(Ljava/lang/String;Ljava/lang/String;Lorg/apache/openjpa/lib/log/Log;)Ljava/lang/Object;", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Exception"});
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnection2UserName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2UserName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnection2UserName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2UserName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnection2Password", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2Password", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnection2Password", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getEncryptionProvider", "()Lorg/apache/openjpa/lib/encryption/EncryptionProvider;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2Password", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/encryption/EncryptionProvider", "decrypt", "(Ljava/lang/String;)Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/lib/encryption/EncryptionProvider"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2Password", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnection2URL", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2URL", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnection2URL", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2URL", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnection2DriverName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2DriverName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnection2DriverName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2DriverName", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnection2Properties", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2Properties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnection2Properties", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connection2Properties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionFactory2Properties", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2Properties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionFactory2Properties", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2Properties", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionFactory2Name", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2Name", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionFactory2Name", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2Name", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionFactory2", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionFactory2", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getConnectionFactory2Name", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getProperty", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lookupConnectionFactory", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionFactory2", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOptimistic", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimistic", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOptimistic", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setOptimistic", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOptimistic", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimistic", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoClear", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAutoClear", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoClear", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAutoClearConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoClear", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRetainState", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "retainState", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRetainState", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setRetainState", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRetainState", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "retainState", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRestoreState", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRestoreState", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRestoreState", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRestoreStateConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "restoreState", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoDetach", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoDetach", "Lorg/apache/openjpa/conf/AutoDetachValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/AutoDetachValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAutoDetach", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoDetach", "Lorg/apache/openjpa/conf/AutoDetachValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/AutoDetachValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAutoDetach", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoDetach", "Lorg/apache/openjpa/conf/AutoDetachValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/AutoDetachValue", "setConstant", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAutoDetachConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "autoDetach", "Lorg/apache/openjpa/conf/AutoDetachValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/AutoDetachValue", "getConstant", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDetachState", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDetachState", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDetachState", "(Lorg/apache/openjpa/conf/DetachOptions;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDetachStateInstance", "()Lorg/apache/openjpa/conf/DetachOptions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/conf/DetachOptions;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "detachStatePlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/conf/DetachOptions");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIgnoreChanges", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "ignoreChanges", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIgnoreChanges", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setIgnoreChanges", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getIgnoreChanges", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "ignoreChanges", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNontransactionalRead", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "nontransactionalRead", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNontransactionalRead", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setNontransactionalRead", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNontransactionalRead", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "nontransactionalRead", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNontransactionalWrite", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "nontransactionalWrite", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setNontransactionalWrite", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setNontransactionalWrite", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNontransactionalWrite", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "nontransactionalWrite", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMultithreaded", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "multithreaded", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMultithreaded", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setMultithreaded", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMultithreaded", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "multithreaded", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFetchBatchSize", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchBatchSize", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFetchBatchSize", "(Ljava/lang/Integer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setFetchBatchSize", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFetchBatchSize", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchBatchSize", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxFetchDepth", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "maxFetchDepth", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setMaxFetchDepth", "(Ljava/lang/Integer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setMaxFetchDepth", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getMaxFetchDepth", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "maxFetchDepth", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFetchGroups", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchGroups", "Lorg/apache/openjpa/lib/conf/StringListValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringListValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFetchGroups", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchGroups", "Lorg/apache/openjpa/lib/conf/StringListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringListValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFetchGroupsList", "()[Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchGroups", "Lorg/apache/openjpa/lib/conf/StringListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringListValue", "get", "()[Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFetchGroups", "([Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "fetchGroups", "Lorg/apache/openjpa/lib/conf/StringListValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringListValue", "set", "([Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFlushBeforeQueries", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFlushBeforeQueries", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFlushBeforeQueries", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFlushBeforeQueriesConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "flushBeforeQueries", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLockTimeout", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLockTimeout", "(Ljava/lang/Integer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setLockTimeout", "(I)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLockTimeout", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lockTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueryTimeout", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQueryTimeout", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryTimeout", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReadLockLevel", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadLockLevel", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setReadLockLevel", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getReadLockLevelConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "readLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWriteLockLevel", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWriteLockLevel", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setWriteLockLevel", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getWriteLockLevelConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "writeLockLevel", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSequence", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSequence", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setSequence", "(Lorg/apache/openjpa/kernel/Seq;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getSequenceInstance", "()Lorg/apache/openjpa/kernel/Seq;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/Seq;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "seqPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/Seq");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionRetainMode", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionRetainMode", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setConnectionRetainMode", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConnectionRetainModeConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "connectionRetainMode", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFilterListeners", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "filterListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFilterListeners", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "filterListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFilterListeners", "([Lorg/apache/openjpa/kernel/exps/FilterListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "filterListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFilterListenerInstances", "()[Lorg/apache/openjpa/kernel/exps/FilterListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "filterListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "filterListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/exps/FilterListener;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "filterListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/kernel/exps/FilterListener;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/kernel/exps/FilterListener;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAggregateListeners", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "aggregateListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAggregateListeners", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "aggregateListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAggregateListeners", "([Lorg/apache/openjpa/kernel/exps/AggregateListener;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "aggregateListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAggregateListenerInstances", "()[Lorg/apache/openjpa/kernel/exps/AggregateListener;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "aggregateListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "aggregateListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/exps/AggregateListener;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "aggregateListenerPlugins", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/kernel/exps/AggregateListener;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/kernel/exps/AggregateListener;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRetryClassRegistration", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "retryClassRegistration", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRetryClassRegistration", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setRetryClassRegistration", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRetryClassRegistration", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "retryClassRegistration", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCompatibility", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCompatibility", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCompatibilityInstance", "()Lorg/apache/openjpa/conf/Compatibility;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getSpecificationInstance", "()Lorg/apache/openjpa/conf/Specification;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/Specification", "getCompatibility", "()Lorg/apache/openjpa/conf/Compatibility;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/conf/Specification"}, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"org/apache/openjpa/conf/Compatibility"});
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/conf/Compatibility;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/conf/Compatibility"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "configure", "(Ljava/lang/Object;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_CHOP,2, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "compatibilityPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/conf/Compatibility");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCallbackOptions", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCallbackOptions", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCallbackOptionsInstance", "()Lorg/apache/openjpa/conf/CallbackOptions;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/conf/CallbackOptions;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "callbackPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/conf/CallbackOptions");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueryCompilationCache", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCompilationCachePlugin", "Lorg/apache/openjpa/conf/QueryCompilationCacheValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/QueryCompilationCacheValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQueryCompilationCache", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCompilationCachePlugin", "Lorg/apache/openjpa/conf/QueryCompilationCacheValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/QueryCompilationCacheValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQueryCompilationCacheInstance", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCompilationCachePlugin", "Lorg/apache/openjpa/conf/QueryCompilationCacheValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/QueryCompilationCacheValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCompilationCachePlugin", "Lorg/apache/openjpa/conf/QueryCompilationCacheValue;");
methodVisitor.visitLdcInsn(Type.getType("Ljava/util/Map;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/QueryCompilationCacheValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "queryCompilationCachePlugin", "Lorg/apache/openjpa/conf/QueryCompilationCacheValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/QueryCompilationCacheValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getStoreFacadeTypeRegistry", "()Lorg/apache/openjpa/util/StoreFacadeTypeRegistry;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "_storeFacadeRegistry", "Lorg/apache/openjpa/util/StoreFacadeTypeRegistry;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBrokerFactoryEventManager", "()Lorg/apache/openjpa/event/BrokerFactoryEventManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "_brokerFactoryEventManager", "Lorg/apache/openjpa/event/BrokerFactoryEventManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRuntimeUnenhancedClasses", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getRuntimeUnenhancedClassesConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRuntimeUnenhancedClasses", "(I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "set", "(I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setRuntimeUnenhancedClasses", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "runtimeUnenhancedClasses", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCacheMarshallers", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheMarshallerPlugins", "Lorg/apache/openjpa/conf/CacheMarshallersValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/CacheMarshallersValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCacheMarshallers", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheMarshallerPlugins", "Lorg/apache/openjpa/conf/CacheMarshallersValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/CacheMarshallersValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCacheMarshallerInstances", "()Ljava/util/Map;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheMarshallerPlugins", "Lorg/apache/openjpa/conf/CacheMarshallersValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/CacheMarshallersValue", "getInstancesAsMap", "()Ljava/util/Map;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isInitializeEagerly", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "eagerInitialization", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInitializeEagerly", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "eagerInitialization", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationMode", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationMode", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidationMode", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationMode", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationMode", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getDefault", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationGroupPrePersist", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationGroupPrePersist", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidationGroupPrePersist", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationGroupPrePersist", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationGroupPrePersist", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getDefault", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationGroupPreUpdate", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationGroupPreUpdate", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidationGroupPreUpdate", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationGroupPreUpdate", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationGroupPreUpdate", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getDefault", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationGroupPreRemove", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationGroupPreRemove", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidationGroupPreRemove", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationGroupPreRemove", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationGroupPreRemove", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getDefault", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/String"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstrumentation", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInstrumentation", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstrumentationInstances", "()[Lorg/apache/openjpa/lib/instrumentation/InstrumentationProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/lib/instrumentation/InstrumentationProvider;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginListValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/lib/instrumentation/InstrumentationProvider;");
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/openjpa/lib/instrumentation/InstrumentationProvider;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInstrumentationManager", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstrumentationManager", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setInstrumentationManager", "(Lorg/apache/openjpa/instrumentation/InstrumentationManager;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/instrumentation/InstrumentationManager", "initialize", "(Lorg/apache/openjpa/conf/OpenJPAConfiguration;Lorg/apache/openjpa/lib/conf/PluginListValue;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInstrumentationManagerInstance", "()Lorg/apache/openjpa/instrumentation/InstrumentationManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/instrumentation/InstrumentationManager");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/instrumentation/InstrumentationManager;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/instrumentation/InstrumentationManager");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "instrumentationProviders", "Lorg/apache/openjpa/lib/conf/PluginListValue;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/instrumentation/InstrumentationManager", "initialize", "(Lorg/apache/openjpa/conf/OpenJPAConfiguration;Lorg/apache/openjpa/lib/conf/PluginListValue;)V", true);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/instrumentation/InstrumentationLevel", "IMMEDIATE", "Lorg/apache/openjpa/lib/instrumentation/InstrumentationLevel;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/instrumentation/InstrumentationManager", "start", "(Lorg/apache/openjpa/lib/instrumentation/InstrumentationLevel;Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/instrumentation/InstrumentationManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "instantiateAll", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/conf/ConfigurationImpl", "instantiateAll", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getMetaDataRepositoryInstance", "()Lorg/apache/openjpa/meta/MetaDataRepository;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getRemoteCommitEventManager", "()Lorg/apache/openjpa/event/RemoteCommitEventManager;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getAuditorInstance", "()Lorg/apache/openjpa/audit/Auditor;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheMarshallerPlugins", "Lorg/apache/openjpa/conf/CacheMarshallersValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/CacheMarshallersValue", "initialize", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "isInitializeEagerly", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getConnectionFactory", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getConnectionFactory2", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "preClose", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "metaRepository", "Lorg/apache/openjpa/meta/MetaDataRepository;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/ImplHelper", "close", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "remoteEventManager", "Lorg/apache/openjpa/event/RemoteCommitEventManager;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/ImplHelper", "close", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getInstrumentationManagerInstance", "()Lorg/apache/openjpa/instrumentation/InstrumentationManager;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/util/ImplHelper", "close", "(Ljava/lang/Object;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/lib/conf/ConfigurationImpl", "preClose", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getConfigurationLog", "()Lorg/apache/openjpa/lib/log/Log;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("openjpa.Runtime");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getLog", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/log/Log;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQuerySQLCache", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "preparedQueryCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setQuerySQLCache", "(Lorg/apache/openjpa/kernel/PreparedQueryCache;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "preparedQueryCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQuerySQLCache", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "preparedQueryCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQuerySQLCacheInstance", "()Lorg/apache/openjpa/kernel/PreparedQueryCache;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "preparedQueryCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "preparedQueryCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "get", "()Ljava/lang/Object;", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "preparedQueryCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/PreparedQueryCache;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "preparedQueryCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/PreparedQueryCache");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setFinderCache", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "finderCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFinderCache", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "finderCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getFinderCacheInstance", "()Lorg/apache/openjpa/kernel/FinderCache;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "finderCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "finderCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/kernel/FinderCache;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "finderCachePlugin", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/kernel/FinderCache");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidationFactoryInstance", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidationFactory", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validationFactory", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getValidatorInstance", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validator", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setValidatorInstance", "(Ljava/lang/Object;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "validator", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLifecycleEventManager", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLifecycleEventManagerInstance", "()Lorg/apache/openjpa/event/LifecycleEventManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "getCompatibilityInstance", "()Lorg/apache/openjpa/conf/Compatibility;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/Compatibility", "isSingletonLifecycleEventManager", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/event/LifecycleEventManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/event/LifecycleEventManager"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/event/LifecycleEventManager;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/event/LifecycleEventManager");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setLifecycleEventManager", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "_allowSetLifeCycleEventManager", "Z");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "_allowSetLifeCycleEventManager", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDynamic", "(Z)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setDynamic", "(Z)V", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "lifecycleEventManager", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDynamicEnhancementAgent", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicEnhancementAgent", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDynamicEnhancementAgent", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dynamicEnhancementAgent", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setEncryptionProvider", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "encryptionProvider", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getEncryptionProvider", "()Lorg/apache/openjpa/lib/encryption/EncryptionProvider;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "encryptionProvider", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "get", "()Ljava/lang/Object;", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "encryptionProvider", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/lib/encryption/EncryptionProvider;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "encryptionProvider", "Lorg/apache/openjpa/lib/conf/PluginValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/PluginValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/lib/encryption/EncryptionProvider");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setDataCacheMode", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheMode", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDataCacheMode", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dataCacheMode", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCacheDistributionPolicy", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCacheDistributionPolicyInstance", "()Lorg/apache/openjpa/datacache/CacheDistributionPolicy;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/datacache/CacheDistributionPolicy");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/datacache/CacheDistributionPolicy;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/datacache/CacheDistributionPolicy");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/datacache/CacheDistributionPolicy"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCacheDistributionPolicy", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setCacheDistributionPolicyInstance", "(Lorg/apache/openjpa/datacache/CacheDistributionPolicy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "cacheDistributionPolicyPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPersistenceEnvironment", "(Ljava/util/Map;)V", "(Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "_peMap", "Ljava/util/Map;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPersistenceEnvironment", "()Ljava/util/Map;", "()Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "_peMap", "Ljava/util/Map;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAuditorInstance", "()Lorg/apache/openjpa/audit/Auditor;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "auditorPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "get", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/audit/Auditor");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "auditorPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/audit/Auditor;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "instantiate", "(Ljava/lang/Class;Lorg/apache/openjpa/lib/conf/Configuration;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/audit/Auditor");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/audit/Auditor"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAuditorInstance", "(Lorg/apache/openjpa/audit/Auditor;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "auditorPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "set", "(Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAuditor", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "auditorPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAuditor", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "auditorPlugin", "Lorg/apache/openjpa/lib/conf/ObjectValue;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/ObjectValue", "setString", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPostLoadOnMerge", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "postLoadOnMerge", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPostLoadOnMerge", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "postLoadOnMerge", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setPostLoadOnMerge", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setPostLoadOnMerge", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getOptimizeIdCopy", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimizeIdCopy", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOptimizeIdCopy", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "optimizeIdCopy", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setOptimizeIdCopy", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setOptimizeIdCopy", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDatabaseAction", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "databaseAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDatabaseActionConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "databaseAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScriptsAction", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "scriptsAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getScriptsActionConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "scriptsAction", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreateSource", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreateSourceConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDropSource", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDropSourceConstant", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropSource", "Lorg/apache/openjpa/lib/conf/IntValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/IntValue", "get", "()Ljava/lang/Integer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Integer", "intValue", "()I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreateScriptSource", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createScriptSource", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDropScriptSource", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropScriptSource", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getCreateScriptTarget", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "createScriptTarget", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getDropScriptTarget", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "dropScriptTarget", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLoadScriptSource", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "loadScriptSource", "Lorg/apache/openjpa/lib/conf/StringValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/StringValue", "getString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getUseTCCLinSelectNew", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "useTcclForSelectNew", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "get", "()Ljava/lang/Boolean;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUseTCCLinSelectNew", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "useTcclForSelectNew", "Lorg/apache/openjpa/lib/conf/BooleanValue;");
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/conf/BooleanValue", "set", "(Z)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUseTCCLinSelectNew", "(Ljava/lang/Boolean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/conf/OpenJPAConfigurationImpl", "setUseTCCLinSelectNew", "(Z)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
