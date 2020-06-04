package asm.org.eclipse.persistence.internal.helper;
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
public class JavaSEPlatformDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_8, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "Ljava/lang/Enum<Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;>;Ljava/lang/Comparable<Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;>;", "java/lang/Enum", new String[] { "java/lang/Comparable" });

classWriter.visitInnerClass("org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "org/eclipse/persistence/internal/helper/JavaSEPlatform", "Version", ACC_PUBLIC | ACC_FINAL | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v1_1", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v1_2", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v1_3", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v1_4", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v1_5", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v1_6", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v1_7", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v1_8", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v9_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v10_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "v11_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC, "stringValuesMap", "Ljava/util/Map;", "Ljava/util/Map<Ljava/lang/String;Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "LENGTH", "I", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "MIN_SUPPORTED", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_STATIC, "LATEST", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "CURRENT", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "version", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "addVersions", "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "ENUM$VALUES", "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_STATIC, "<clinit>", "()V", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v1_1");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_1", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v1_2");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_2", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v1_3");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_3", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v1_4");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_4", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v1_5");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_5", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v1_6");
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_6", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v1_7");
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_7", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v1_8");
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_8", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v9_0");
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "<init>", "(IILorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v9_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v10_0");
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v10_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("v11_0");
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v11_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitIntInsn(BIPUSH, 11);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_1", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_2", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_3", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_4", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_5", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_6", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 6);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_7", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 7);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_8", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 8);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v9_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 9);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v10_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitIntInsn(BIPUSH, 10);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v11_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "ENUM$VALUES", "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitTypeInsn(NEW, "java/util/HashMap");
methodVisitor.visitInsn(DUP);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "values", "()[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/HashMap", "<init>", "(I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "stringValuesMap", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "values", "()[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", false);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 1);
Label label0 = new Label();
methodVisitor.visitJumpInsn(GOTO, label0);
Label label1 = new Label();
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "stringValuesMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "versionString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "getAdditionalVersions", "()[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;", false);
methodVisitor.visitVarInsn(ASTORE, 4);
methodVisitor.visitVarInsn(ALOAD, 4);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label2);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 8);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitVarInsn(ISTORE, 7);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ISTORE, 6);
Label label3 = new Label();
methodVisitor.visitJumpInsn(GOTO, label3);
Label label4 = new Label();
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_FULL, 9, new Object[] {"org/eclipse/persistence/internal/helper/JavaSEPlatform", Opcodes.INTEGER, Opcodes.INTEGER, "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;", Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;"}, 0, new Object[] {});
methodVisitor.visitVarInsn(ALOAD, 8);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitInsn(AALOAD);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "stringValuesMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "versionString", "()Ljava/lang/String;", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitIincInsn(6, 1);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 6);
methodVisitor.visitVarInsn(ILOAD, 7);
methodVisitor.visitJumpInsn(IF_ICMPLT, label4);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_FULL, 4, new Object[] {Opcodes.TOP, Opcodes.INTEGER, Opcodes.INTEGER, "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;"}, 0, new Object[] {});
methodVisitor.visitIincInsn(1, 1);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitJumpInsn(IF_ICMPLT, label1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "values", "()[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", false);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "LENGTH", "I");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_8", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "MIN_SUPPORTED", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v11_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "LATEST", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaVersion", "vmVersion", "()Lorg/eclipse/persistence/internal/helper/JavaVersion;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/JavaVersion", "toPlatform", "()Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "CURRENT", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(14, 9);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "is", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "CURRENT", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "equals", "(Ljava/lang/Object;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "atLeast", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "CURRENT", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "gte", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;)Z", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toValue", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNULL, label0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "stringValuesMap", "Ljava/util/Map;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "toValue", "(II)Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ILOAD, 0);
Label label0 = new Label();
Label label1 = new Label();
Label label2 = new Label();
Label label3 = new Label();
Label label4 = new Label();
methodVisitor.visitLookupSwitchInsn(label4, new int[] { 1, 9, 10, 11 }, new Label[] { label0, label1, label2, label3 });
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitVarInsn(ILOAD, 1);
Label label5 = new Label();
Label label6 = new Label();
Label label7 = new Label();
Label label8 = new Label();
Label label9 = new Label();
Label label10 = new Label();
Label label11 = new Label();
Label label12 = new Label();
Label label13 = new Label();
Label label14 = new Label();
methodVisitor.visitTableSwitchInsn(1, 9, label14, new Label[] { label5, label6, label7, label8, label9, label10, label11, label12, label13 });
methodVisitor.visitLabel(label5);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_1", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label6);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_2", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label7);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_3", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label8);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_4", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label9);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_5", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label10);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_6", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label11);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_7", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label12);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v1_8", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label13);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v9_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label14);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "LATEST", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label1);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v9_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label2);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v10_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label3);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "v11_0", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitLabel(label4);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "LATEST", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL | ACC_STATIC, "versionString", "(II)Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/lang/StringBuilder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/StringBuilder", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitIntInsn(BIPUSH, 46);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(C)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "toString", "(I)Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "append", "(Ljava/lang/String;)Ljava/lang/StringBuilder;", false);
methodVisitor.visitInsn(POP);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "java/lang/StringBuilder", "toString", "()Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PRIVATE | ACC_VARARGS, "<init>", "(Ljava/lang/String;III[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ILOAD, 2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Enum", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitTypeInsn(NEW, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ILOAD, 3);
methodVisitor.visitVarInsn(ILOAD, 4);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "<init>", "(IILorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)V", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "version", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitFieldInsn(PUTFIELD, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "addVersions", "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(6, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMajor", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "version", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "access$1", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getMinor", "()I", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "version", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "access$2", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)I", false);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_FINAL, "getAdditionalVersions", "()[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "addVersions", "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "gte", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "compareTo", "(Ljava/lang/Enum;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "isSupported", "()Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "MIN_SUPPORTED", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "compareTo", "(Ljava/lang/Enum;)I", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFLT, label0);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitLabel(label0);
methodVisitor.visitFrame(Opcodes.F_SAME, 0, null, 0, null);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "versionString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "version", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "access$1", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "version", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "access$2", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "versionString", "(II)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "version", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "access$1", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)I", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "version", "Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform$Version", "access$2", "(Lorg/eclipse/persistence/internal/helper/JavaSEPlatform$Version;)I", false);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "versionString", "(II)Ljava/lang/String;", false);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/eclipse/persistence/internal/helper/JavaSEPlatform", "ENUM$VALUES", "[Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ARRAYLENGTH);
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ISTORE, 1);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ASTORE, 2);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitVarInsn(ILOAD, 1);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/System", "arraycopy", "(Ljava/lang/Object;ILjava/lang/Object;II)V", false);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(5, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/eclipse/persistence/internal/helper/JavaSEPlatform;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/eclipse/persistence/internal/helper/JavaSEPlatform");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
