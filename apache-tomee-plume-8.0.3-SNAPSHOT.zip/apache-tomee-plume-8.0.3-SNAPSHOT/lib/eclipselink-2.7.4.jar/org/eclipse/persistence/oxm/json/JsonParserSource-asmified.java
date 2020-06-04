package asm.org.eclipse.persistence.oxm.json;
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
public class JsonParserSourceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER, "org/eclipse/persistence/oxm/json/JsonParserSource", null, "org/eclipse/persistence/internal/oxm/record/ExtendedSource", null);

classWriter.visitInnerClass("org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader", "JsonParserReaderBuilder", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "parser", "Ljavax/json/stream/JsonParser;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljavax/json/stream/JsonParser;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/ExtendedSource", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/oxm/json/JsonParserSource", "parser", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getParser", "()Ljavax/json/stream/JsonParser;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/json/JsonParserSource", "parser", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReader", "(Lorg/eclipse/persistence/internal/oxm/Unmarshaller;)Lorg/eclipse/persistence/internal/oxm/record/XMLReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/json/JsonParserSource", "parser", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "<init>", "(Ljavax/json/stream/JsonParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "setUnmarshaller", "(Lorg/eclipse/persistence/internal/oxm/Unmarshaller;)Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "build", "()Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "createReader", "(Lorg/eclipse/persistence/internal/oxm/Unmarshaller;Ljava/lang/Class;)Lorg/eclipse/persistence/internal/oxm/record/XMLReader;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/oxm/json/JsonParserSource", "parser", "Ljavax/json/stream/JsonParser;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "<init>", "(Ljavax/json/stream/JsonParser;)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "setResultClass", "(Ljava/lang/Class;)Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder;", false);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "setUnmarshaller", "(Lorg/eclipse/persistence/internal/oxm/Unmarshaller;)Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/oxm/record/json/JsonParserReader$JsonParserReaderBuilder", "build", "()Lorg/eclipse/persistence/internal/oxm/record/json/JsonParserReader;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
