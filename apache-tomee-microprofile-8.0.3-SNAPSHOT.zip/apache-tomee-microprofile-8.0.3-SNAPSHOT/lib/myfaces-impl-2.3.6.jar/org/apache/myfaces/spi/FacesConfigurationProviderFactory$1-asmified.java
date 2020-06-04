package asm.org.apache.myfaces.spi;
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
public class FacesConfigurationProviderFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER, "org/apache/myfaces/spi/FacesConfigurationProviderFactory$1", "Ljava/lang/Object;Ljava/security/PrivilegedExceptionAction<Ljava/lang/Object;>;", "java/lang/Object", new String[] { "java/security/PrivilegedExceptionAction" });

classWriter.visitOuterClass("org/apache/myfaces/spi/FacesConfigurationProviderFactory", "getFacesConfigurationProviderFactory", "(Ljavax/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/FacesConfigurationProviderFactory;");

classWriter.visitInnerClass("org/apache/myfaces/spi/FacesConfigurationProviderFactory$1", null, null, ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$ectx", "Ljavax/faces/context/ExternalContext;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljavax/faces/context/ExternalContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/myfaces/spi/FacesConfigurationProviderFactory$1", "val$ectx", "Ljavax/faces/context/ExternalContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Ljava/lang/Object;", null, new String[] { "java/security/PrivilegedActionException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/myfaces/spi/FacesConfigurationProviderFactory$1", "val$ectx", "Ljavax/faces/context/ExternalContext;");
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/myfaces/spi/FacesConfigurationProviderFactory;"));
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/myfaces/spi/FacesConfigurationProviderFactory", "FACTORY_DEFAULT", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/myfaces/spi/impl/SpiUtils", "build", "(Ljavax/faces/context/ExternalContext;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
