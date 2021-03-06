package asm.org.apache.tomee.myfaces;
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
public class TomEEFacesConfigResourceProviderFactory$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory$1", "Ljava/lang/Object;Ljava/security/PrivilegedExceptionAction<Lorg/apache/myfaces/spi/FacesConfigResourceProvider;>;", "java/lang/Object", new String[] { "java/security/PrivilegedExceptionAction" });

classWriter.visitOuterClass("org/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory", "createFacesConfigResourceProvider", "(Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/FacesConfigResourceProvider;");

classWriter.visitInnerClass("org/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "val$externalContext", "Ljakarta/faces/context/ExternalContext;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory;Ljakarta/faces/context/ExternalContext;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory$1", "this$0", "Lorg/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory$1", "val$externalContext", "Ljakarta/faces/context/ExternalContext;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "run", "()Lorg/apache/myfaces/spi/FacesConfigResourceProvider;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory$1", "this$0", "Lorg/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory$1", "val$externalContext", "Ljakarta/faces/context/ExternalContext;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory", "access$000", "(Lorg/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory;Ljakarta/faces/context/ExternalContext;)Lorg/apache/myfaces/spi/FacesConfigResourceProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "run", "()Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomee/myfaces/TomEEFacesConfigResourceProviderFactory$1", "run", "()Lorg/apache/myfaces/spi/FacesConfigResourceProvider;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
