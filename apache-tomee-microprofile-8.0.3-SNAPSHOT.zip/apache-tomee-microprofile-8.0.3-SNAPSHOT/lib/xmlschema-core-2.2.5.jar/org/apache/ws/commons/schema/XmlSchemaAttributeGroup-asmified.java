package asm.org.apache.ws.commons.schema;
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
public class XmlSchemaAttributeGroupDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_PUBLIC | ACC_SUPER, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", null, "org/apache/ws/commons/schema/XmlSchemaAnnotated", new String[] { "org/apache/ws/commons/schema/utils/XmlSchemaNamed", "org/apache/ws/commons/schema/XmlSchemaAttributeGroupMember" });

classWriter.visitInnerClass("org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", null, null, 0);

classWriter.visitInnerClass("org/apache/ws/commons/schema/XmlSchemaAttributeGroup$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "anyAttribute", "Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributes", "Ljava/util/List;", "Ljava/util/List<Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroupMember;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/ws/commons/schema/XmlSchema;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAnnotated", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "<init>", "(Lorg/apache/ws/commons/schema/XmlSchema;Z)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$1");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$1", "<init>", "(Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;Lorg/apache/ws/commons/schema/XmlSchema;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/utils/CollectionFactory", "withSchemaModifiable", "(Ljava/lang/Runnable;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroupMember;"));
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/utils/CollectionFactory", "getList", "(Ljava/lang/Class;)Ljava/util/List;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "attributes", "Ljava/util/List;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnyAttribute", "()Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "anyAttribute", "Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setAnyAttribute", "(Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "anyAttribute", "Lorg/apache/ws/commons/schema/XmlSchemaAnyAttribute;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAttributes", "()Ljava/util/List;", "()Ljava/util/List<Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroupMember;>;", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "attributes", "Ljava/util/List;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getName", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getParent", "()Lorg/apache/ws/commons/schema/XmlSchema;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getQName", "()Ljavax/xml/namespace/QName;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "getQName", "()Ljavax/xml/namespace/QName;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAnonymous", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "isAnonymous", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isTopLevel", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/ws/commons/schema/utils/XmlSchemaNamedImpl", "isTopLevel", "()Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setName", "(Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitTypeInsn(NEW, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup$2", "<init>", "(Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/ws/commons/schema/utils/CollectionFactory", "withSchemaModifiable", "(Ljava/lang/Runnable;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$000", "(Lorg/apache/ws/commons/schema/XmlSchemaAttributeGroup;)Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/ws/commons/schema/XmlSchemaAttributeGroup", "namedDelegate", "Lorg/apache/ws/commons/schema/utils/XmlSchemaNamedImpl;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
