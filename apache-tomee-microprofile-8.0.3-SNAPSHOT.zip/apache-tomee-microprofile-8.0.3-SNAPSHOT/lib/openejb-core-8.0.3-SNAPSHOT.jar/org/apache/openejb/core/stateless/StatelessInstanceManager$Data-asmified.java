package asm.org.apache.openejb.core.stateless;
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
public class StatelessInstanceManager$DataDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "org/apache/openejb/core/stateless/StatelessInstanceManager", "Data", ACC_PRIVATE | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/core/stateless/StatelessInstanceManager$Data$1", null, null, 0);

classWriter.visitInnerClass("org/apache/openejb/util/Pool$Entry", "org/apache/openejb/util/Pool", "Entry", ACC_PUBLIC | ACC_FINAL);

classWriter.visitInnerClass("org/apache/openejb/core/stateless/StatelessInstanceManager$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "pool", "Lorg/apache/openejb/util/Pool;", "Lorg/apache/openejb/util/Pool<Lorg/apache/openejb/core/stateless/Instance;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "accessTimeout", "Lorg/apache/openejb/util/Duration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "closeTimeout", "Lorg/apache/openejb/util/Duration;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "jmxNames", "Ljava/util/List;", "Ljava/util/List<Ljavax/management/ObjectName;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "sessionContext", "Ljavax/ejb/SessionContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager;Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Duration;Lorg/apache/openejb/util/Duration;)V", "(Lorg/apache/openejb/util/Pool<Lorg/apache/openejb/core/stateless/Instance;>;Lorg/apache/openejb/util/Duration;Lorg/apache/openejb/util/Duration;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "this$0", "Lorg/apache/openejb/core/stateless/StatelessInstanceManager;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "jmxNames", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "pool", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "accessTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "closeTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/stateless/StatelessContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/core/stateless/StatelessInstanceManager", "access$1000", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager;)Lorg/apache/openejb/spi/SecurityService;", false);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data$1", "<init>", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;Lorg/apache/openejb/core/stateless/StatelessInstanceManager;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/stateless/StatelessContext", "<init>", "(Lorg/apache/openejb/spi/SecurityService;Ljava/io/Flushable;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "sessionContext", "Ljavax/ejb/SessionContext;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(8, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAccessTimeout", "()Lorg/apache/openejb/util/Duration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "accessTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "poolPop", "()Lorg/apache/openejb/util/Pool$Entry;", "()Lorg/apache/openejb/util/Pool<Lorg/apache/openejb/core/stateless/Instance;>.Entry;", new String[] { "java/lang/InterruptedException", "java/util/concurrent/TimeoutException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "pool", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "accessTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Duration", "getTime", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "accessTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Duration", "getUnit", "()Ljava/util/concurrent/TimeUnit;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool", "pop", "(JLjava/util/concurrent/TimeUnit;)Lorg/apache/openejb/util/Pool$Entry;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getPool", "()Lorg/apache/openejb/util/Pool;", "()Lorg/apache/openejb/util/Pool<Lorg/apache/openejb/core/stateless/Instance;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "pool", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "closePool", "()Z", null, new String[] { "java/lang/InterruptedException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "pool", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "closeTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Duration", "getTime", "()J", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "closeTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Duration", "getUnit", "()Ljava/util/concurrent/TimeUnit;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/util/Pool", "close", "(JLjava/util/concurrent/TimeUnit;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "add", "(Ljavax/management/ObjectName;)Ljavax/management/ObjectName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "jmxNames", "Ljava/util/List;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$300", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;)Lorg/apache/openejb/util/Duration;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "accessTimeout", "Lorg/apache/openejb/util/Duration;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager;Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Duration;Lorg/apache/openejb/util/Duration;Lorg/apache/openejb/core/stateless/StatelessInstanceManager$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "<init>", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager;Lorg/apache/openejb/util/Pool;Lorg/apache/openejb/util/Duration;Lorg/apache/openejb/util/Duration;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$600", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;)Ljavax/ejb/SessionContext;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "sessionContext", "Ljavax/ejb/SessionContext;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$700", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;)Lorg/apache/openejb/util/Pool;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "pool", "Lorg/apache/openejb/util/Pool;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$900", "(Lorg/apache/openejb/core/stateless/StatelessInstanceManager$Data;)Ljava/util/List;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/core/stateless/StatelessInstanceManager$Data", "jmxNames", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
