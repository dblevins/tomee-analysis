package asm.org.apache.openejb.jee;
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
public class TransAttribute$JAXBDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/jee/TransAttribute$JAXB", "Lorg/metatype/sxc/jaxb/JAXBEnum<Lorg/apache/openejb/jee/TransAttribute;>;", "org/metatype/sxc/jaxb/JAXBEnum", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/TransAttribute;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "intern", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("transAttribute");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "intern", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/jaxb/JAXBEnum", "<init>", "(Ljava/lang/Class;Ljavax/xml/namespace/QName;Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "parse", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;Ljava/lang/String;)Lorg/apache/openejb/jee/TransAttribute;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/TransAttribute$JAXB", "parseTransAttribute", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;Ljava/lang/String;)Lorg/apache/openejb/jee/TransAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "(Ljava/lang/Object;Ljava/lang/String;Lorg/metatype/sxc/jaxb/RuntimeContext;Lorg/apache/openejb/jee/TransAttribute;)Ljava/lang/String;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/TransAttribute$JAXB", "toStringTransAttribute", "(Ljava/lang/Object;Ljava/lang/String;Lorg/metatype/sxc/jaxb/RuntimeContext;Lorg/apache/openejb/jee/TransAttribute;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "parseTransAttribute", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;Ljava/lang/String;)Lorg/apache/openejb/jee/TransAttribute;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitLdcInsn("NotSupported");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "NOT_SUPPORTED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("Supports");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "SUPPORTS", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("Required");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("RequiresNew");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRES_NEW", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("Mandatory");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "MANDATORY", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn("Never");
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "NEVER", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/TransAttribute;"));
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLdcInsn("NotSupported");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitLdcInsn("Supports");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitLdcInsn("Required");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitLdcInsn("RequiresNew");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitLdcInsn("Mandatory");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitLdcInsn("Never");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "unexpectedEnumValue", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toStringTransAttribute", "(Ljava/lang/Object;Ljava/lang/String;Lorg/metatype/sxc/jaxb/RuntimeContext;Lorg/apache/openejb/jee/TransAttribute;)Ljava/lang/String;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "NOT_SUPPORTED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label0);
methodVisitor.visitLdcInsn("NotSupported");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "SUPPORTS", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label1);
methodVisitor.visitLdcInsn("Supports");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label2);
methodVisitor.visitLdcInsn("Required");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRES_NEW", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitLdcInsn("RequiresNew");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "MANDATORY", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label4);
methodVisitor.visitLdcInsn("Mandatory");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "NEVER", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitVarInsn(ALOAD, 3);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label5);
methodVisitor.visitLdcInsn("Never");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/openejb/jee/TransAttribute");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "NOT_SUPPORTED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "SUPPORTS", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRED", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "REQUIRES_NEW", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "MANDATORY", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/openejb/jee/TransAttribute", "NEVER", "Lorg/apache/openejb/jee/TransAttribute;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "unexpectedEnumConst", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)V", false);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(8, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "toString", "(Ljava/lang/Object;Ljava/lang/String;Lorg/metatype/sxc/jaxb/RuntimeContext;Ljava/lang/Object;)Ljava/lang/String;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/TransAttribute");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/TransAttribute$JAXB", "toString", "(Ljava/lang/Object;Ljava/lang/String;Lorg/metatype/sxc/jaxb/RuntimeContext;Lorg/apache/openejb/jee/TransAttribute;)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 5);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "parse", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;Ljava/lang/String;)Ljava/lang/Object;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/TransAttribute$JAXB", "parse", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;Ljava/lang/String;)Lorg/apache/openejb/jee/TransAttribute;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
