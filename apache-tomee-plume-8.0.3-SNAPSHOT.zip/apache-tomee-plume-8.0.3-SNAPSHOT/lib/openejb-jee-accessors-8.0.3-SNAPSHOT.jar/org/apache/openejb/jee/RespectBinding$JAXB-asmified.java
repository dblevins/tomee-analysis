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
public class RespectBinding$JAXBDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/openejb/jee/RespectBinding$JAXB", "Lorg/metatype/sxc/jaxb/JAXBObject<Lorg/apache/openejb/jee/RespectBinding;>;", "org/metatype/sxc/jaxb/JAXBObject", null);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/RespectBinding;"));
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "intern", "()Ljava/lang/String;", false);
methodVisitor.visitLdcInsn("respect-bindingType");
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
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "readRespectBinding", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Lorg/apache/openejb/jee/RespectBinding;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/RespectBinding$JAXB", "_read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Lorg/apache/openejb/jee/RespectBinding;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "writeRespectBinding", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Lorg/apache/openejb/jee/RespectBinding;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/RespectBinding$JAXB", "_write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Lorg/apache/openejb/jee/RespectBinding;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Lorg/apache/openejb/jee/RespectBinding;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/RespectBinding$JAXB", "_write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Lorg/apache/openejb/jee/RespectBinding;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Lorg/apache/openejb/jee/RespectBinding;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "isXsiNil", "()Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/jaxb/RuntimeContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/jaxb/RuntimeContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/apache/openejb/jee/RespectBinding");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/openejb/jee/RespectBinding", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/LifecycleCallback", "NONE", "Lorg/metatype/sxc/jaxb/LifecycleCallback;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "beforeUnmarshal", "(Ljava/lang/Object;Lorg/metatype/sxc/jaxb/LifecycleCallback;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "getXsiType", "()Ljavax/xml/namespace/QName;", true);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitLdcInsn("respect-bindingType");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getLocalPart", "()Ljava/lang/String;", false);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label3);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/xml/namespace/QName", "getNamespaceURI", "()Ljava/lang/String;", false);
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,2, new Object[] {"org/apache/openejb/jee/RespectBinding", "javax/xml/namespace/QName"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/RespectBinding;"));
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "unexpectedXsiType", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Ljava/lang/Class;)Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/RespectBinding");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "getAttributes", "()Ljava/lang/Iterable;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label5 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label5);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/metatype/sxc/util/Attribute");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLdcInsn("http://www.w3.org/2001/XMLSchema-instance");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/Attribute", "getNamespace", "()Ljava/lang/String;", true);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label6);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "unexpectedAttribute", "(Lorg/metatype/sxc/util/Attribute;[Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label4);
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "getChildElements", "()Ljava/lang/Iterable;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/lang/Iterable", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 4);
Label label7 = new Label();
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/util/Iterator"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label8);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/metatype/sxc/util/XoXMLStreamReader");
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitLdcInsn("enabled");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "getLocalName", "()Ljava/lang/String;", true);
Label label9 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPNE, label9);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "getNamespaceURI", "()Ljava/lang/String;", true);
methodVisitor.visitJumpInsn(IF_ACMPNE, label9);
methodVisitor.visitLdcInsn("1");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "getElementAsString", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFNE, label10);
methodVisitor.visitLdcInsn("true");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamReader", "getElementAsString", "()Ljava/lang/String;", true);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label11);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"org/metatype/sxc/util/XoXMLStreamReader"}, 0, null);
methodVisitor.visitInsn(ICONST_1);
Label label12 = new Label();
methodVisitor.visitJumpInsn(GOTO, label12);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME1, 0, null, 1, new Object[] {Opcodes.INTEGER});
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/openejb/jee/RespectBinding", "enabled", "Ljava/lang/Boolean;");
Label label13 = new Label();
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "javax/xml/namespace/QName");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee");
methodVisitor.visitLdcInsn("enabled");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "javax/xml/namespace/QName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "unexpectedElement", "(Lorg/metatype/sxc/util/XoXMLStreamReader;[Ljavax/xml/namespace/QName;)V", false);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitJumpInsn(GOTO, label7);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_CHOP,1, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/LifecycleCallback", "NONE", "Lorg/metatype/sxc/jaxb/LifecycleCallback;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "afterUnmarshal", "(Ljava/lang/Object;Lorg/metatype/sxc/jaxb/LifecycleCallback;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(9, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Lorg/apache/openejb/jee/RespectBinding;", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/openejb/jee/RespectBinding$JAXB", "_read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Lorg/apache/openejb/jee/RespectBinding;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "_write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Lorg/apache/openejb/jee/RespectBinding;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeXsiNil", "()V", true);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label1);
methodVisitor.visitTypeInsn(NEW, "org/metatype/sxc/jaxb/RuntimeContext");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/metatype/sxc/jaxb/RuntimeContext", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/RespectBinding;"));
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IF_ACMPEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/openejb/jee/RespectBinding;"));
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/Class");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "unexpectedSubclass", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Ljava/lang/Object;Ljava/lang/Class;[Ljava/lang/Class;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/LifecycleCallback", "NONE", "Lorg/metatype/sxc/jaxb/LifecycleCallback;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "beforeMarshal", "(Ljava/lang/Object;Lorg/metatype/sxc/jaxb/LifecycleCallback;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/openejb/jee/RespectBinding", "enabled", "Ljava/lang/Boolean;");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 3);
Label label3 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitLdcInsn("http://java.sun.com/xml/ns/javaee");
methodVisitor.visitLdcInsn("enabled");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeStartElementWithAutoPrefix", "(Ljava/lang/String;Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Boolean", "booleanValue", "()Z", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "toString", "(Z)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeCharacters", "(Ljava/lang/String;)V", true);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/metatype/sxc/util/XoXMLStreamWriter", "writeEndElement", "()V", true);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_APPEND,1, new Object[] {"java/lang/Boolean"}, 0, null);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/metatype/sxc/jaxb/LifecycleCallback", "NONE", "Lorg/metatype/sxc/jaxb/LifecycleCallback;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/metatype/sxc/jaxb/RuntimeContext", "afterMarshal", "(Ljava/lang/Object;Lorg/metatype/sxc/jaxb/LifecycleCallback;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_BRIDGE | ACC_SYNTHETIC, "write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Ljava/lang/Object;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/openejb/jee/RespectBinding");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/RespectBinding$JAXB", "write", "(Lorg/metatype/sxc/util/XoXMLStreamWriter;Lorg/apache/openejb/jee/RespectBinding;Lorg/metatype/sxc/jaxb/RuntimeContext;)V", false);
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
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/openejb/jee/RespectBinding$JAXB", "read", "(Lorg/metatype/sxc/util/XoXMLStreamReader;Lorg/metatype/sxc/jaxb/RuntimeContext;)Lorg/apache/openejb/jee/RespectBinding;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
