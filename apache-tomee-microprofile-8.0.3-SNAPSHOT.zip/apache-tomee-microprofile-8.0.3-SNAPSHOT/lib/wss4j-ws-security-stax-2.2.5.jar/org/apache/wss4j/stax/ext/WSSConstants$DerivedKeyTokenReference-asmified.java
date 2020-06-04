package asm.org.apache.wss4j.stax.ext;
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
public class WSSConstants$DerivedKeyTokenReferenceDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "Ljava/lang/Enum<Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "org/apache/wss4j/stax/ext/WSSConstants", "DerivedKeyTokenReference", ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DirectReference", "Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "EncryptedKey", "Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "SecurityContextToken", "Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "$VALUES", "[Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DirectReference");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "DirectReference", "Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("EncryptedKey");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "EncryptedKey", "Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;");
methodVisitor.visitTypeInsn(NEW, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("SecurityContextToken");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "SecurityContextToken", "Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "DirectReference", "Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "EncryptedKey", "Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "SecurityContextToken", "Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference", "$VALUES", "[Lorg/apache/wss4j/stax/ext/WSSConstants$DerivedKeyTokenReference;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
