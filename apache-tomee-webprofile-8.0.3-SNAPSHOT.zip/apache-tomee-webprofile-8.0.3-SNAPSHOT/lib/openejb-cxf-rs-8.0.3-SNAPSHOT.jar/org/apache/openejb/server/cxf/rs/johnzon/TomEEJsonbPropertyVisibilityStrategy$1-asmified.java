package asm.org.apache.openejb.server.cxf.rs.johnzon;
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
public class TomEEJsonbPropertyVisibilityStrategy$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbPropertyVisibilityStrategy$1", null, "java/lang/Object", new String[] { "javax/json/bind/config/PropertyVisibilityStrategy" });

classWriter.visitOuterClass("org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbPropertyVisibilityStrategy", "visibilityStrategy", "(Ljava/lang/Class;)Ljavax/json/bind/config/PropertyVisibilityStrategy;");

classWriter.visitInnerClass("org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbPropertyVisibilityStrategy$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbPropertyVisibilityStrategy;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbPropertyVisibilityStrategy;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbPropertyVisibilityStrategy$1", "this$0", "Lorg/apache/openejb/server/cxf/rs/johnzon/TomEEJsonbPropertyVisibilityStrategy;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isVisible", "(Ljava/lang/reflect/Field;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isVisible", "(Ljava/lang/reflect/Method;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
