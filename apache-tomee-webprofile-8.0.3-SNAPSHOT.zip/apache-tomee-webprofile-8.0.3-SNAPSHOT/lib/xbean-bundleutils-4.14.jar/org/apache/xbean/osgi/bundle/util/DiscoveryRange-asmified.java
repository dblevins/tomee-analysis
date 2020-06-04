package asm.org.apache.xbean.osgi.bundle.util;
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
public class DiscoveryRangeDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_FINAL | ACC_SUPER | ACC_ENUM, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "Ljava/lang/Enum<Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;>;", "java/lang/Enum", null);

{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "REQUIRED_BUNDLES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "IMPORT_PACKAGES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "BUNDLE_CLASSPATH", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PUBLIC | ACC_FINAL | ACC_STATIC | ACC_ENUM, "FRAGMENT_BUNDLES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL | ACC_STATIC | ACC_SYNTHETIC, "$VALUES", "[Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "values", "()[Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;", null, null);
methodVisitor.visitCode();
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "$VALUES", "[Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "[Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;", "clone", "()Ljava/lang/Object;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "[Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 0);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC | ACC_STATIC, "valueOf", "(Ljava/lang/String;)Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;", null, null);
methodVisitor.visitCode();
methodVisitor.visitLdcInsn(Type.getType("Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;"));
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;", false);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/osgi/bundle/util/DiscoveryRange");
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
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/osgi/bundle/util/DiscoveryRange");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("REQUIRED_BUNDLES");
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "REQUIRED_BUNDLES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/osgi/bundle/util/DiscoveryRange");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("IMPORT_PACKAGES");
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "IMPORT_PACKAGES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/osgi/bundle/util/DiscoveryRange");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("BUNDLE_CLASSPATH");
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "BUNDLE_CLASSPATH", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/osgi/bundle/util/DiscoveryRange");
methodVisitor.visitInsn(DUP);
methodVisitor.visitLdcInsn("FRAGMENT_BUNDLES");
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "<init>", "(Ljava/lang/String;I)V", false);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "FRAGMENT_BUNDLES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitInsn(ICONST_4);
methodVisitor.visitTypeInsn(ANEWARRAY, "org/apache/xbean/osgi/bundle/util/DiscoveryRange");
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "REQUIRED_BUNDLES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "IMPORT_PACKAGES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "BUNDLE_CLASSPATH", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitInsn(DUP);
methodVisitor.visitInsn(ICONST_3);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "FRAGMENT_BUNDLES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitInsn(AASTORE);
methodVisitor.visitFieldInsn(PUTSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "$VALUES", "[Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 0);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
