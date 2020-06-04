package asm.org.apache.tomcat.util.bcel.classfile;
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
public class ElementValuePairDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_SUPER, "org/apache/tomcat/util/bcel/classfile/ElementValuePair", null, "java/lang/Object", null);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "elementValue", "Lorg/apache/tomcat/util/bcel/classfile/ElementValue;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "constantPool", "Lorg/apache/tomcat/util/bcel/classfile/ConstantPool;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "elementNameIndex", "I", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Ljava/io/DataInput;Lorg/apache/tomcat/util/bcel/classfile/ConstantPool;)V", null, new String[] { "java/io/IOException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/bcel/classfile/ElementValuePair", "constantPool", "Lorg/apache/tomcat/util/bcel/classfile/ConstantPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/io/DataInput", "readUnsignedShort", "()I", true);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/bcel/classfile/ElementValuePair", "elementNameIndex", "I");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/tomcat/util/bcel/classfile/ElementValue", "readElementValue", "(Ljava/io/DataInput;Lorg/apache/tomcat/util/bcel/classfile/ConstantPool;)Lorg/apache/tomcat/util/bcel/classfile/ElementValue;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/tomcat/util/bcel/classfile/ElementValuePair", "elementValue", "Lorg/apache/tomcat/util/bcel/classfile/ElementValue;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getNameString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/bcel/classfile/ElementValuePair", "constantPool", "Lorg/apache/tomcat/util/bcel/classfile/ConstantPool;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/bcel/classfile/ElementValuePair", "elementNameIndex", "I");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/bcel/classfile/ConstantPool", "getConstant", "(IB)Lorg/apache/tomcat/util/bcel/classfile/Constant;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/tomcat/util/bcel/classfile/ConstantUtf8");
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/tomcat/util/bcel/classfile/ConstantUtf8", "getBytes", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getValue", "()Lorg/apache/tomcat/util/bcel/classfile/ElementValue;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/tomcat/util/bcel/classfile/ElementValuePair", "elementValue", "Lorg/apache/tomcat/util/bcel/classfile/ElementValue;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
