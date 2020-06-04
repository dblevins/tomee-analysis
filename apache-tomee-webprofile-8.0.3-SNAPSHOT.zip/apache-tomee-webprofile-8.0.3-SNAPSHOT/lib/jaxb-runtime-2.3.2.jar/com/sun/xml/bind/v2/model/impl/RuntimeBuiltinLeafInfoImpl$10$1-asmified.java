package asm.com.sun.xml.bind.v2.model.impl;
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
public class RuntimeBuiltinLeafInfoImpl$10$1Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_SUPER, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$10$1", null, "java/awt/Component", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$10", "convertToBufferedImage", "(Ljava/awt/Image;)Ljava/awt/image/BufferedImage;");

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$10", null, null, 0);

classWriter.visitInnerClass("com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$10$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lcom/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$10;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lcom/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$10;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$10$1", "this$0", "Lcom/sun/xml/bind/v2/model/impl/RuntimeBuiltinLeafInfoImpl$10;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/awt/Component", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
