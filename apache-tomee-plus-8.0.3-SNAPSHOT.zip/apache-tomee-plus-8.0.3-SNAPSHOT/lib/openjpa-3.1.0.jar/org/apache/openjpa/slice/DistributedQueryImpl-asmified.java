package asm.org.apache.openjpa.slice;
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
public class DistributedQueryImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openjpa/slice/DistributedQueryImpl", null, "org/apache/openjpa/kernel/QueryImpl", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "serialVersionUID", "J", null, new Long(1L));
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "_lock", "Lorg/apache/openjpa/slice/ReentrantSliceLock;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "_conf", "Lorg/apache/openjpa/slice/DistributedConfiguration;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/openjpa/kernel/Broker;Ljava/lang/String;Lorg/apache/openjpa/kernel/StoreQuery;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/QueryImpl", "<init>", "(Lorg/apache/openjpa/kernel/Broker;Ljava/lang/String;Lorg/apache/openjpa/kernel/StoreQuery;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openjpa/slice/ReentrantSliceLock");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/slice/ReentrantSliceLock", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/slice/DistributedQueryImpl", "_lock", "Lorg/apache/openjpa/slice/ReentrantSliceLock;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/kernel/Broker", "getConfiguration", "()Lorg/apache/openjpa/conf/OpenJPAConfiguration;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/slice/DistributedConfiguration");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openjpa/slice/DistributedQueryImpl", "_conf", "Lorg/apache/openjpa/slice/DistributedConfiguration;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "execute", "(Ljava/util/Map;)Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/DistributedQueryImpl", "getFetchConfiguration", "()Lorg/apache/openjpa/kernel/FetchConfiguration;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openjpa/slice/jdbc/TargetFetchConfiguration");
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/jdbc/TargetFetchConfiguration", "isExplicitTarget", "()Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/DistributedQueryImpl", "_conf", "Lorg/apache/openjpa/slice/DistributedConfiguration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/slice/DistributedConfiguration", "getQueryTargetPolicyInstance", "()Lorg/apache/openjpa/slice/QueryTargetPolicy;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/DistributedQueryImpl", "getQueryString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "unmodifiableMap", "(Ljava/util/Map;)Ljava/util/Map;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/DistributedQueryImpl", "getLanguage", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/DistributedQueryImpl", "_conf", "Lorg/apache/openjpa/slice/DistributedConfiguration;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/slice/DistributedConfiguration", "getActiveSliceNames", "()Ljava/util/List;", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/DistributedQueryImpl", "getBroker", "()Lorg/apache/openjpa/kernel/Broker;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/openjpa/slice/QueryTargetPolicy", "getTargets", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;Ljava/lang/Object;)[Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/jdbc/TargetFetchConfiguration", "setTargets", "([Ljava/lang/String;)V", false);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/apache/openjpa/slice/jdbc/TargetFetchConfiguration"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openjpa/kernel/QueryImpl", "execute", "(Ljava/util/Map;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "lock", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/DistributedQueryImpl", "_lock", "Lorg/apache/openjpa/slice/ReentrantSliceLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/ReentrantSliceLock", "lock", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "unlock", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openjpa/slice/DistributedQueryImpl", "_lock", "Lorg/apache/openjpa/slice/ReentrantSliceLock;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openjpa/slice/ReentrantSliceLock", "unlock", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
