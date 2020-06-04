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
public class JohnzonBuilder$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_SUPER, "org/apache/johnzon/jsonb/JohnzonBuilder$2", "Lorg/apache/johnzon/jsonb/JohnzonBuilder$Lazy<Ljavax/json/stream/JsonParserFactory;>;", "org/apache/johnzon/jsonb/JohnzonBuilder$Lazy", null);

classWriter.visitOuterClass("org/apache/johnzon/jsonb/JohnzonBuilder", "createJsonParserFactory", "()Ljava/util/function/Supplier;");

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JohnzonBuilder$2", null, null, 0);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JohnzonBuilder$Lazy", "org/apache/johnzon/jsonb/JohnzonBuilder", "Lazy", ACC_PRIVATE | ACC_STATIC | ACC_ABSTRACT);

classWriter.visitInnerClass("org/apache/johnzon/jsonb/JohnzonBuilder$1", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/johnzon/jsonb/JohnzonBuilder;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/johnzon/jsonb/JohnzonBuilder;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/johnzon/jsonb/JohnzonBuilder$2", "this$0", "Lorg/apache/johnzon/jsonb/JohnzonBuilder;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/johnzon/jsonb/JohnzonBuilder$Lazy", "<init>", "(Lorg/apache/johnzon/jsonb/JohnzonBuilder$1;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "doCreate", "()Ljavax/json/stream/JsonParserFactory;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/johnzon/jsonb/JohnzonBuilder$2", "this$0", "Lorg/apache/johnzon/jsonb/JohnzonBuilder;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/johnzon/jsonb/JohnzonBuilder", "access$100", "(Lorg/apache/johnzon/jsonb/JohnzonBuilder;)Ljavax/json/spi/JsonProvider;", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptyMap", "()Ljava/util/Map;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "javax/json/spi/JsonProvider", "createParserFactory", "(Ljava/util/Map;)Ljavax/json/stream/JsonParserFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED | ACC_BRIDGE | ACC_SYNTHETIC, "doCreate", "()Ljava/lang/Object;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/johnzon/jsonb/JohnzonBuilder$2", "doCreate", "()Ljavax/json/stream/JsonParserFactory;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
