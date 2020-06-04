package asm.com.sun.xml.bind.v2.schemagen;
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
public class Form$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/xml/bind/v2/schemagen/Form$2", null, "com/sun/xml/bind/v2/schemagen/Form", null);

classWriter.visitOuterClass("com/sun/xml/bind/v2/schemagen/Form", null, null);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/Form$2", null, null, ACC_FINAL | ACC_ENUM);

classWriter.visitInnerClass("com/sun/xml/bind/v2/schemagen/Form$1", null, null, ACC_FINAL | ACC_ENUM);

{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/lang/String;ILjavax/xml/bind/annotation/XmlNsForm;Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/schemagen/Form", "<init>", "(Ljava/lang/String;ILjavax/xml/bind/annotation/XmlNsForm;ZLcom/sun/xml/bind/v2/schemagen/Form$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "declare", "(Ljava/lang/String;Lcom/sun/xml/bind/v2/schemagen/xmlschema/Schema;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("unqualified");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "com/sun/xml/bind/v2/schemagen/xmlschema/Schema", "_attribute", "(Ljava/lang/String;Ljava/lang/Object;)V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
