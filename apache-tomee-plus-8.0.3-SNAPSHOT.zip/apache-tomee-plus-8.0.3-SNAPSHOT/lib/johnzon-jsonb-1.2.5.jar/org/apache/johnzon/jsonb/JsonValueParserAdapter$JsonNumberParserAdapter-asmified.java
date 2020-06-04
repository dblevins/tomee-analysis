package asm.org.apache.johnzon.jsonb;
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
public class JsonValueParserAdapter$JsonNumberParserAdapterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/jsonb/JsonValueParserAdapter$JsonNumberParserAdapter", "Lorg/apache/johnzon/jsonb/JsonValueParserAdapter<Ljavax/json/JsonNumber;>;", "org/apache/johnzon/jsonb/JsonValueParserAdapter", null);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JsonValueParserAdapter$JsonNumberParserAdapter", "org/apache/johnzon/jsonb/JsonValueParserAdapter", "JsonNumberParserAdapter", ACC_PRIVATE | ACC_STATIC);

{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/json/JsonNumber;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/JsonValueParserAdapter", "<init>", "(Ljavax/json/JsonValue;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isIntegralNumber", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/JsonValueParserAdapter$JsonNumberParserAdapter", "getValue", "()Ljavax/json/JsonValue;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonNumber");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonNumber", "isIntegral", "()Z", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getInt", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/JsonValueParserAdapter$JsonNumberParserAdapter", "getValue", "()Ljavax/json/JsonValue;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonNumber");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonNumber", "intValueExact", "()I", true);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getLong", "()J", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/JsonValueParserAdapter$JsonNumberParserAdapter", "getValue", "()Ljavax/json/JsonValue;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonNumber");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonNumber", "longValueExact", "()J", true);
methodVisitor.visitInsn(LRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getBigDecimal", "()Ljava/math/BigDecimal;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/JsonValueParserAdapter$JsonNumberParserAdapter", "getValue", "()Ljavax/json/JsonValue;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "javax/json/JsonNumber");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "javax/json/JsonNumber", "bigDecimalValue", "()Ljava/math/BigDecimal;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
