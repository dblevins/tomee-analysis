package asm.org.eclipse.persistence.internal.jpa.deployment;
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
public class JavaSECMPInitializer$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/eclipse/persistence/internal/jpa/deployment/JavaSECMPInitializer$1", null, "java/lang/Object", new String[] { "java/lang/instrument/ClassFileTransformer" });

classWriter.visitOuterClass("org/eclipse/persistence/internal/jpa/deployment/JavaSECMPInitializer", "registerTransformer", "(Ljakarta/persistence/spi/ClassTransformer;Ljakarta/persistence/spi/PersistenceUnitInfo;Ljava/util/Map;)V");

classWriter.visitInnerClass("org/eclipse/persistence/internal/jpa/deployment/JavaSECMPInitializer$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$transformer", "Ljakarta/persistence/spi/ClassTransformer;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/eclipse/persistence/internal/jpa/deployment/JavaSECMPInitializer;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/eclipse/persistence/internal/jpa/deployment/JavaSECMPInitializer;Ljakarta/persistence/spi/ClassTransformer;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/deployment/JavaSECMPInitializer$1", "this$0", "Lorg/eclipse/persistence/internal/jpa/deployment/JavaSECMPInitializer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/jpa/deployment/JavaSECMPInitializer$1", "val$transformer", "Ljakarta/persistence/spi/ClassTransformer;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "transform", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class<*>;Ljava/security/ProtectionDomain;[B)[B", new String[] { "java/lang/instrument/IllegalClassFormatException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/jpa/deployment/JavaSECMPInitializer$1", "val$transformer", "Ljakarta/persistence/spi/ClassTransformer;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "jakarta/persistence/spi/ClassTransformer", "transform", "(Ljava/lang/ClassLoader;Ljava/lang/String;Ljava/lang/Class;Ljava/security/ProtectionDomain;[B)[B", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
