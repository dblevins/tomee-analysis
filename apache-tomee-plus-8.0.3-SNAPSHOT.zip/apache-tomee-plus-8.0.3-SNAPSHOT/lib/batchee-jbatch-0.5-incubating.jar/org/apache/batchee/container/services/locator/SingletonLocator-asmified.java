package asm.org.apache.batchee.container.services.locator;
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
public class SingletonLocatorDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/batchee/container/services/locator/SingletonLocator", null, "java/lang/Object", new String[] { "org/apache/batchee/container/services/ServicesManagerLocator" });

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/apache/batchee/container/services/ServicesManagerLocator;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "MANAGER", "Lorg/apache/batchee/container/services/ServicesManager;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "find", "()Lorg/apache/batchee/container/services/ServicesManager;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/services/locator/SingletonLocator", "MANAGER", "Lorg/apache/batchee/container/services/ServicesManager;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/services/locator/SingletonLocator");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/services/locator/SingletonLocator", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/batchee/container/services/locator/SingletonLocator", "INSTANCE", "Lorg/apache/batchee/container/services/ServicesManagerLocator;");
methodVisitor.visitTypeInsn(NEW, "org/apache/batchee/container/services/ServicesManager");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/batchee/container/services/ServicesManager", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/batchee/container/services/locator/SingletonLocator", "MANAGER", "Lorg/apache/batchee/container/services/ServicesManager;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/batchee/container/services/locator/SingletonLocator", "MANAGER", "Lorg/apache/batchee/container/services/ServicesManager;");
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/batchee/container/services/ServicesManager", "init", "(Ljava/util/Properties;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
