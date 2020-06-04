package asm.org.eclipse.persistence.internal.oxm.record.json;
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
public class JsonParserReader$JsonParserReaderBuilderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", null, "java/lang/Object", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader", "JsonParserReaderBuilder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parser", "Ljavax/json/stream/JsonParser;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "um", "Lorg/eclipse/persistence/internal/oxm/Unmarshaller;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "resultClass", "Ljava/lang/Class;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/json/stream/JsonParser;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "parser", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setUnmarshaller", "(Lorg/eclipse/persistence/internal/oxm/Unmarshaller;)Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "um", "Lorg/eclipse/persistence/internal/oxm/Unmarshaller;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "setResultClass", "(Ljava/lang/Class;)Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "resultClass", "Ljava/lang/Class;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "build", "()Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "parser", "Ljavax/json/stream/JsonParser;");
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNONNULL, label0);
methodVisitor.visitTypeInsn(NEW, "java/lang/NullPointerException");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("JsonParser can't be null");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/NullPointerException", "<init>", "(Ljava/lang/String;)V", false);
methodVisitor.visitInsn(ATHROW);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader", "<init>", "(Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder;Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader;)V", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(4, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$0", "(Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder;)Ljavax/json/stream/JsonParser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "parser", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$1", "(Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder;)Ljava/lang/Class;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "resultClass", "Ljava/lang/Class;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC | ACC_SYNTHETIC, "access$2", "(Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder;)Lorg/eclipse/persistence/internal/oxm/Unmarshaller;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "um", "Lorg/eclipse/persistence/internal/oxm/Unmarshaller;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
