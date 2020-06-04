package asm.com.sun.xml.messaging.saaj.util.stax;
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
public class SaajStaxWriterEx$StateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_7, ACC_FINAL | ACC_SUPER | ACC_ENUM, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "Ljava/lang/Enum<Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx", "State", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "xopInclude", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "others", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "$VALUES", "[Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;I)V", "()V", null);
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
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("xopInclude");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "xopInclude", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;");
methodVisitor.visitTypeInsn(NEW, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("others");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "others", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitTypeInsn(ANEWARRAY, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "xopInclude", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "others", "Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "com/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State", "$VALUES", "[Lcom/sun/xml/messaging/saaj/util/stax/SaajStaxWriterEx$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
