package asm.org.metatype.sxc.jaxb;
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
public class StandardJAXBObjects$BooleanJAXBDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "Lorg/metatype/sxc/jaxb/JAXBObject<Ljava/lang/Boolean;>;", "org/metatype/sxc/jaxb/JAXBObject", null);

classWriter.visitInnerClass("org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "org/metatype/sxc/jaxb/StandardJAXBObjects", "BooleanJAXB", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Ljava/lang/Boolean;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema");
methodVisitor.visitLdcInsn("boolean");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "intern", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/jaxb/JAXBObject", "<init>", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Ljava/lang/Boolean;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "isXsiNil", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "getElementAsString", "()Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "parseBoolean", "(Ljava/lang/String;)Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Ljava/lang/Boolean;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 2);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeXsiNil", "()V", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", true);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Ljava/lang/Object;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/Boolean");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Ljava/lang/Boolean;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Ljava/lang/Boolean;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "<init>", "()V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB", "INSTANCE", "Lorg/metatype/sxc/jaxb/StandardJAXBObjects$BooleanJAXB;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
