package asm.com.sun.xml.bind.v2.model.annotation;
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
public class XmlAttributeQuickDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER, "com/sun/xml/bind/v2/model/annotation/XmlAttributeQuick", null, "com/sun/xml/bind/v2/model/annotation/Quick", new String[] { "javax/xml/bind/annotation/XmlAttribute" });

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "core", "Ljavax/xml/bind/annotation/XmlAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljavax/xml/bind/annotation/XmlAttribute;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/annotation/Quick", "<init>", "(Lcom/sun/xml/bind/v2/model/annotation/Locatable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "com/sun/xml/bind/v2/model/annotation/XmlAttributeQuick", "core", "Ljavax/xml/bind/annotation/XmlAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getAnnotation", "()Ljava/lang/annotation/Annotation;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/annotation/XmlAttributeQuick", "core", "Ljavax/xml/bind/annotation/XmlAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "newInstance", "(Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljava/lang/annotation/Annotation;)Lcom/sun/xml/bind/v2/model/annotation/Quick;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/bind/v2/model/annotation/XmlAttributeQuick");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/xml/bind/annotation/XmlAttribute");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/bind/v2/model/annotation/XmlAttributeQuick", "<init>", "(Lcom/sun/xml/bind/v2/model/annotation/Locatable;Ljavax/xml/bind/annotation/XmlAttribute;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "annotationType", "()Ljava/lang/Class;", "()Ljava/lang/Class<Ljavax/xml/bind/annotation/XmlAttribute;>;", null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Ljavax/xml/bind/annotation/XmlAttribute;"));
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "name", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/annotation/XmlAttributeQuick", "core", "Ljavax/xml/bind/annotation/XmlAttribute;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/annotation/XmlAttribute", "name", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "namespace", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/annotation/XmlAttributeQuick", "core", "Ljavax/xml/bind/annotation/XmlAttribute;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/annotation/XmlAttribute", "namespace", "()Ljava/lang/String;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "required", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "com/sun/xml/bind/v2/model/annotation/XmlAttributeQuick", "core", "Ljavax/xml/bind/annotation/XmlAttribute;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/xml/bind/annotation/XmlAttribute", "required", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
