package asm.org.eclipse.persistence.jaxb.xmlmodel;
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
public class XmlVirtualAccessMethodsSchemaDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "Ljava/lang/Enum<Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;>;", "java/lang/Enum", null);

{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlType;", true);
annotationVisitor0.visit("name", "xml-virtual-access-methods-schema");
annotationVisitor0.visitEnd();
}
{
annotationVisitor0 = classWriter.visitAnnotation("Ljavax/xml/bind/annotation/XmlEnum;", true);
annotationVisitor0.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NODES", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "ANY", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NODES");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "NODES", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("ANY");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "ANY", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "NODES", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "ANY", "Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "ENUM$VALUES", "[Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "value", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "name", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "fromValue", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema", "ENUM$VALUES", "[Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/jaxb/xmlmodel/XmlVirtualAccessMethodsSchema");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
