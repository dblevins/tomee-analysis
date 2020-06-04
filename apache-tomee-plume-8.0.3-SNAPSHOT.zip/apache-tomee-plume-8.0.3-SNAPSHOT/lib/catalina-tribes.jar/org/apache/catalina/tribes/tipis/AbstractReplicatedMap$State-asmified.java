package asm.org.apache.catalina.tribes.tipis;
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
public class AbstractReplicatedMap$StateDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "Ljava/lang/Enum<Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;>;", "java/lang/Enum", null);

classWriter.visitInnerClass("org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "org/apache/catalina/tribes/tipis/AbstractReplicatedMap", "State", ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_ENUM);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "NEW", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "STATETRANSFERRED", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "INITIALIZED", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "DESTROYED", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "available", "Z", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "$VALUES", "[Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE, "<init>", "(Ljava/lang/String;IZ)V", "(Z)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "available", "Z");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isAvailable", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "available", "Z");
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("NEW");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "NEW", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("STATETRANSFERRED");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "STATETRANSFERRED", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("INITIALIZED");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "INITIALIZED", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitTypeInsn(NEW, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("DESTROYED");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "<init>", "(Ljava/lang/String;IZ)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "DESTROYED", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "NEW", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "STATETRANSFERRED", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "INITIALIZED", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "DESTROYED", "Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/catalina/tribes/tipis/AbstractReplicatedMap$State", "$VALUES", "[Lorg/apache/catalina/tribes/tipis/AbstractReplicatedMap$State;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
