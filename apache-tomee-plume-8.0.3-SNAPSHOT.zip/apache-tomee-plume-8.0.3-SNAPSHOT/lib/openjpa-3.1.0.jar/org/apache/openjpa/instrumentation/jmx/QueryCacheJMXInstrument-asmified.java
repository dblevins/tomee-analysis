package asm.org.apache.openjpa.instrumentation.jmx;
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
public class QueryCacheJMXInstrumentDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", null, "org/apache/openjpa/instrumentation/AbstractQueryCacheInstrument", new String[] { "org/apache/openjpa/instrumentation/jmx/JMXInstrument", "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrumentMBean" });

classWriter.visitInnerClass("org/apache/openjpa/lib/util/Localizer$Message", "org/apache/openjpa/lib/util/Localizer", "Message", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_STATIC, "_loc", "Lorg/apache/openjpa/lib/util/Localizer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MBEAN_TYPE", "Ljava/lang/String;", null, "QueryCache");
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_objName", "Ljavax/management/ObjectName;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/instrumentation/AbstractQueryCacheInstrument", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "_objName", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("QueryCache");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLevel", "()Lorg/apache/openjpa/lib/instrumentation/InstrumentationLevel;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/lib/instrumentation/InstrumentationLevel", "FACTORY", "Lorg/apache/openjpa/lib/instrumentation/InstrumentationLevel;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "initialize", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "getProvider", "()Lorg/apache/openjpa/lib/instrumentation/InstrumentationProvider;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/instrumentation/InstrumentationProvider", "getConfiguration", "()Lorg/apache/openjpa/lib/conf/Configuration;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/conf/OpenJPAConfiguration");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getDataCacheManagerInstance", "()Lorg/apache/openjpa/datacache/DataCacheManager;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/datacache/DataCacheManager", "getSystemQueryCache", "()Lorg/apache/openjpa/datacache/QueryCache;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/UserException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("query-cache-not-found");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/UserException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,3, new Object[] {"org/apache/openjpa/conf/OpenJPAConfiguration", "org/apache/openjpa/datacache/DataCacheManager", "org/apache/openjpa/datacache/QueryCache"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "setQueryCache", "(Lorg/apache/openjpa/datacache/QueryCache;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/conf/OpenJPAConfiguration", "getId", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "setConfigId", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "getContext", "()Ljava/lang/Object;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "identityHashCode", "(Ljava/lang/Object;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "setContextRef", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getObjectName", "()Ljavax/management/ObjectName;", null, null);
methodVisitor.visitCode();
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
methodVisitor.visitTryCatchBlock(label0, label1, label2, "java/lang/Throwable");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "_objName", "Ljavax/management/ObjectName;");
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "_objName", "Ljavax/management/ObjectName;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/instrumentation/jmx/JMXProvider", "createObjectName", "(Lorg/apache/openjpa/instrumentation/jmx/JMXInstrument;Ljava/util/Map;)Ljavax/management/ObjectName;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "_objName", "Ljavax/management/ObjectName;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "_objName", "Ljavax/management/ObjectName;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {"java/lang/Throwable"});
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/util/UserException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitLdcInsn("unable-to-create-object-name");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/lib/util/Localizer", "get", "(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/openjpa/lib/util/Localizer$Message;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/util/UserException", "<init>", "(Lorg/apache/openjpa/lib/util/Localizer$Message;Ljava/lang/Throwable;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitMaxs(5, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "start", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "getProvider", "()Lorg/apache/openjpa/lib/instrumentation/InstrumentationProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/instrumentation/InstrumentationProvider", "startInstrument", "(Lorg/apache/openjpa/lib/instrumentation/Instrument;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "stop", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "getProvider", "()Lorg/apache/openjpa/lib/instrumentation/InstrumentationProvider;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/lib/instrumentation/InstrumentationProvider", "stopInstrument", "(Lorg/apache/openjpa/lib/instrumentation/Instrument;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openjpa/lib/util/Localizer", "forPackage", "(Ljava/lang/Class;)Lorg/apache/openjpa/lib/util/Localizer;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/openjpa/instrumentation/jmx/QueryCacheJMXInstrument", "_loc", "Lorg/apache/openjpa/lib/util/Localizer;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
