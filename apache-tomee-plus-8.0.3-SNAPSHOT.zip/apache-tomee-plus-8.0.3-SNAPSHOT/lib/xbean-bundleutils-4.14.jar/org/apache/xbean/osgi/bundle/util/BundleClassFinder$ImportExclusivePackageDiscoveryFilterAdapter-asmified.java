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
public class BundleClassFinder$ImportExclusivePackageDiscoveryFilterAdapterDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_SUPER, "org/apache/xbean/osgi/bundle/util/BundleClassFinder$ImportExclusivePackageDiscoveryFilterAdapter", null, "java/lang/Object", new String[] { "org/apache/xbean/osgi/bundle/util/ClassDiscoveryFilter" });

classWriter.visitInnerClass("org/apache/xbean/osgi/bundle/util/BundleClassFinder$ImportExclusivePackageDiscoveryFilterAdapter", "org/apache/xbean/osgi/bundle/util/BundleClassFinder", "ImportExclusivePackageDiscoveryFilterAdapter", ACC_PRIVATE | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "acceptedPackageNames", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "classDiscoveryFilter", "Lorg/apache/xbean/osgi/bundle/util/ClassDiscoveryFilter;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/apache/xbean/osgi/bundle/util/ClassDiscoveryFilter;Ljava/util/Set;)V", "(Lorg/apache/xbean/osgi/bundle/util/ClassDiscoveryFilter;Ljava/util/Set<Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/osgi/bundle/util/BundleClassFinder$ImportExclusivePackageDiscoveryFilterAdapter", "classDiscoveryFilter", "Lorg/apache/xbean/osgi/bundle/util/ClassDiscoveryFilter;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/osgi/bundle/util/BundleClassFinder$ImportExclusivePackageDiscoveryFilterAdapter", "acceptedPackageNames", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "directoryDiscoveryRequired", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "jarFileDiscoveryRequired", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitInsn(ICONST_1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(1, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "packageDiscoveryRequired", "(Ljava/lang/String;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/osgi/bundle/util/BundleClassFinder$ImportExclusivePackageDiscoveryFilterAdapter", "acceptedPackageNames", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/osgi/bundle/util/BundleClassFinder$ImportExclusivePackageDiscoveryFilterAdapter", "classDiscoveryFilter", "Lorg/apache/xbean/osgi/bundle/util/ClassDiscoveryFilter;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/apache/xbean/osgi/bundle/util/ClassDiscoveryFilter", "packageDiscoveryRequired", "(Ljava/lang/String;)Z", true);
methodVisitor.visitJumpInsn(IFEQ, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "rangeDiscoveryRequired", "(Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;)Z", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "IMPORT_PACKAGES", "Lorg/apache/xbean/osgi/bundle/util/DiscoveryRange;");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/osgi/bundle/util/DiscoveryRange", "equals", "(Ljava/lang/Object;)Z", false);
Label label0 = new Label();
methodVisitor.visitJumpInsn(IFNE, label0);
methodVisitor.visitInsn(ICONST_1);
Label label1 = new Label();
methodVisitor.visitJumpInsn(GOTO, label1);
methodVisitor.visitLabel(label0);
methodVisitor.visitInsn(ICONST_0);
methodVisitor.visitLabel(label1);
methodVisitor.visitInsn(IRETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
