package asm.org.apache.tomee.microprofile.config;
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
public class TomEEOpenAPIExtension$TypeElementImplDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl", null, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$ElementImpl", new String[] { "org/apache/geronimo/microprofile/openapi/impl/processor/AnnotatedTypeElement" });

classWriter.visitInnerClass("org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl", "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension", "TypeElementImpl", ACC_PRIVATE | ACC_STATIC);

classWriter.visitInnerClass("org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$ElementImpl", "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension", "ElementImpl", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "type", "Ljava/lang/reflect/Type;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/reflect/Type;Ljavax/enterprise/inject/spi/Annotated;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$ElementImpl", "<init>", "(Ljavax/enterprise/inject/spi/Annotated;Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$1;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl", "type", "Ljava/lang/reflect/Type;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getType", "()Ljava/lang/reflect/Type;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl", "type", "Ljava/lang/reflect/Type;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_SYNTHETIC, "<init>", "(Ljava/lang/reflect/Type;Ljavax/enterprise/inject/spi/Annotated;Lorg/apache/tomee/microprofile/config/TomEEOpenAPIExtension$1;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/tomee/microprofile/config/TomEEOpenAPIExtension$TypeElementImpl", "<init>", "(Ljava/lang/reflect/Type;Ljavax/enterprise/inject/spi/Annotated;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
