package asm.org.opensaml.xacml.impl;
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
public class AbstractXACMLObjectBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_PUBLIC | ACC_SUPER | ACC_ABSTRACT, "org/opensaml/xacml/impl/AbstractXACMLObjectBuilder", "<XACMLObjectType::Lorg/opensaml/xacml/XACMLObject;>Lorg/opensaml/core/xml/AbstractXMLObjectBuilder<TXACMLObjectType;>;Lorg/opensaml/xacml/XACMLObjectBuilder<TXACMLObjectType;>;", "org/opensaml/core/xml/AbstractXMLObjectBuilder", new String[] { "org/opensaml/xacml/XACMLObjectBuilder" });

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/opensaml/core/xml/AbstractXMLObjectBuilder", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_ABSTRACT, "buildObject", "()Lorg/opensaml/xacml/XACMLObject;", "()TXACMLObjectType;", null);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
