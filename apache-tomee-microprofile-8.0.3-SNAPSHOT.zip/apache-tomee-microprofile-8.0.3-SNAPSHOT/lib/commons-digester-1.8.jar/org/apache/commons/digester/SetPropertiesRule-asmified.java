package asm.org.apache.commons.digester;
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
public class SetPropertiesRuleDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_2, ACC_PUBLIC | ACC_SUPER, "org/apache/commons/digester/SetPropertiesRule", null, "org/apache/commons/digester/Rule", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "attributeNames", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "propertyNames", "[Ljava/lang/String;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "ignoreMissingProperty", "Z", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_DEPRECATED, "<init>", "(Lorg/apache/commons/digester/Digester;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/SetPropertiesRule", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/Rule", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "ignoreMissingProperty", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/Rule", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "ignoreMissingProperty", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "([Ljava/lang/String;[Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/commons/digester/Rule", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "ignoreMissingProperty", "Z");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(3, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 7);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "begin", "(Lorg/xml/sax/Attributes;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "()V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 4);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLocalName", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLdcInsn("");
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label4 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getQName", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getValue", "(I)Ljava/lang/String;", true);
methodVisitor.visitVarInsn(ASTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 8);
Label label5 = new Label();
methodVisitor.visitJumpInsn(GOTO, label5);
Label label6 = new Label();
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "equals", "(Ljava/lang/Object;)Z", false);
Label label7 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label7);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 4);
Label label8 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label8);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 6);
Label label9 = new Label();
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label8);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitJumpInsn(GOTO, label9);
methodVisitor.visitLabel(label7);
methodVisitor.visitIincInsn(8, 1);
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ILOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label6);
methodVisitor.visitLabel(label9);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/Digester", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label10 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/Digester", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitLdcInsn("[SetPropertiesRule]{");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/Digester", "match", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn("} Setting property '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn("' to '");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn("'");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label10);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "ignoreMissingProperty", "Z");
Label label11 = new Label();
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitJumpInsn(IFNULL, label11);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "peek", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 9);
methodVisitor.visitVarInsn(ALOAD, 9);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/PropertyUtils", "isWriteable", "(Ljava/lang/Object;Ljava/lang/String;)Z", false);
methodVisitor.visitVarInsn(ISTORE, 10);
methodVisitor.visitVarInsn(ILOAD, 10);
methodVisitor.visitJumpInsn(IFNE, label11);
methodVisitor.visitTypeInsn(NEW, "java/lang/NoSuchMethodException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitLdcInsn("Property ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn(" can't be set");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NoSuchMethodException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label11);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label12 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label12);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 7);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/util/HashMap", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label12);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/xml/sax/Attributes", "getLength", "()I", true);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/commons/digester/Digester", "peek", "()Ljava/lang/Object;", false);
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/Digester", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "isDebugEnabled", "()Z", true);
Label label13 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label13);
methodVisitor.visitVarInsn(ALOAD, 6);
Label label14 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label14);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/Digester", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitLdcInsn("[SetPropertiesRule]{");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/Digester", "match", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn("} Set ");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Class", "getName", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn(" properties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitJumpInsn(GOTO, label13);
methodVisitor.visitLabel(label14);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/Digester", "log", "Lorg/apache/commons/logging/Log;");
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "()V", false);
methodVisitor.visitLdcInsn("[SetPropertiesRule]{");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "digester", "Lorg/apache/commons/digester/Digester;");
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/Digester", "match", "Ljava/lang/String;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitLdcInsn("} Set NULL properties");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/commons/logging/Log", "debug", "(Ljava/lang/Object;)V", true);
methodVisitor.visitLabel(label13);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/commons/beanutils/BeanUtils", "populate", "(Ljava/lang/Object;Ljava/util/Map;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 11);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "addAlias", "(Ljava/lang/String;Ljava/lang/String;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 3);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 5);
Label label2 = new Label();
methodVisitor.visitJumpInsn(GOTO, label2);
Label label3 = new Label();
methodVisitor.visitLabel(label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(5, 1);
methodVisitor.visitLabel(label2);
methodVisitor.visitVarInsn(ILOAD, 5);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitJumpInsn(IF_ICMPLT, label3);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IADD);
methodVisitor.visitTypeInsn(ANEWARRAY, "java/lang/String");
methodVisitor.visitVarInsn(ASTORE, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 7);
Label label4 = new Label();
methodVisitor.visitJumpInsn(GOTO, label4);
Label label5 = new Label();
methodVisitor.visitLabel(label5);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitIincInsn(7, 1);
methodVisitor.visitLabel(label4);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ILOAD, 3);
Label label6 = new Label();
methodVisitor.visitJumpInsn(IF_ICMPGE, label6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitJumpInsn(IF_ICMPLT, label5);
methodVisitor.visitLabel(label6);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 6);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "propertyNames", "[Ljava/lang/String;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "attributeNames", "[Ljava/lang/String;");
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 8);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuffer");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SetPropertiesRule[");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuffer", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitLdcInsn("]");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "append", "(Ljava/lang/String;)Ljava/lang/StringBuffer;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuffer", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isIgnoreMissingProperty", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/commons/digester/SetPropertiesRule", "ignoreMissingProperty", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setIgnoreMissingProperty", "(Z)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/digester/SetPropertiesRule", "ignoreMissingProperty", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}