package asm.org.apache.xbean.finder;
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
public class BundleAnnotationFinderDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/xbean/finder/BundleAnnotationFinder", null, "org/apache/xbean/finder/AbstractFinder", null);

classWriter.visitInnerClass("org/apache/xbean/finder/BundleAnnotationFinder$1", null, null, ACC_STATIC | ACC_SYNTHETIC);

classWriter.visitInnerClass("org/apache/xbean/finder/BundleAnnotationFinder$AnnotationFindingCallback", "org/apache/xbean/finder/BundleAnnotationFinder", "AnnotationFindingCallback", ACC_PRIVATE);

classWriter.visitInnerClass("java/util/Map$Entry", "java/util/Map", "Entry", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

classWriter.visitInnerClass("org/apache/xbean/finder/AbstractFinder$ClassInfo", "org/apache/xbean/finder/AbstractFinder", "ClassInfo", ACC_PUBLIC);

classWriter.visitInnerClass("org/apache/xbean/osgi/bundle/util/BundleResourceFinder$ResourceFinderCallback", "org/apache/xbean/osgi/bundle/util/BundleResourceFinder", "ResourceFinderCallback", ACC_PUBLIC | ACC_STATIC | ACC_ABSTRACT | ACC_INTERFACE);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "bundle", "Lorg/osgi/framework/Bundle;", null, null);
fieldVisitor.visitEnd();
}
{
fieldVisitor = classWriter.visitField(ACC_PRIVATE | ACC_FINAL, "paths", "Ljava/util/Set;", "Ljava/util/Set<Ljava/lang/String;>;", null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/osgi/service/packageadmin/PackageAdmin;Lorg/osgi/framework/Bundle;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitFieldInsn(GETSTATIC, "org/apache/xbean/osgi/bundle/util/BundleResourceFinder", "FULL_DISCOVERY_FILTER", "Lorg/apache/xbean/osgi/bundle/util/ResourceDiscoveryFilter;");
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/BundleAnnotationFinder", "<init>", "(Lorg/osgi/service/packageadmin/PackageAdmin;Lorg/osgi/framework/Bundle;Lorg/apache/xbean/osgi/bundle/util/ResourceDiscoveryFilter;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 3);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/osgi/service/packageadmin/PackageAdmin;Lorg/osgi/framework/Bundle;Lorg/apache/xbean/osgi/bundle/util/ResourceDiscoveryFilter;)V", null, new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESTATIC, "java/util/Collections", "emptySet", "()Ljava/util/Set;", false);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/BundleAnnotationFinder", "<init>", "(Lorg/osgi/service/packageadmin/PackageAdmin;Lorg/osgi/framework/Bundle;Lorg/apache/xbean/osgi/bundle/util/ResourceDiscoveryFilter;Ljava/util/Set;)V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(5, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Lorg/osgi/service/packageadmin/PackageAdmin;Lorg/osgi/framework/Bundle;Lorg/apache/xbean/osgi/bundle/util/ResourceDiscoveryFilter;Ljava/util/Set;)V", "(Lorg/osgi/service/packageadmin/PackageAdmin;Lorg/osgi/framework/Bundle;Lorg/apache/xbean/osgi/bundle/util/ResourceDiscoveryFilter;Ljava/util/Set<Ljava/lang/String;>;)V", new String[] { "java/lang/Exception" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/AbstractFinder", "<init>", "()V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/osgi/bundle/util/BundleUtils", "unwrapBundle", "(Lorg/osgi/framework/Bundle;)Lorg/osgi/framework/Bundle;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/BundleAnnotationFinder", "bundle", "Lorg/osgi/framework/Bundle;");
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/osgi/bundle/util/BundleResourceFinder");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/BundleAnnotationFinder", "bundle", "Lorg/osgi/framework/Bundle;");
methodVisitor.visitLdcInsn("");
methodVisitor.visitLdcInsn(".class");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/osgi/bundle/util/BundleResourceFinder", "<init>", "(Lorg/osgi/service/packageadmin/PackageAdmin;Lorg/osgi/framework/Bundle;Ljava/lang/String;Ljava/lang/String;Lorg/apache/xbean/osgi/bundle/util/ResourceDiscoveryFilter;)V", false);
methodVisitor.visitVarInsn(ASTORE, 5);
methodVisitor.visitVarInsn(ALOAD, 5);
methodVisitor.visitTypeInsn(NEW, "org/apache/xbean/finder/BundleAnnotationFinder$AnnotationFindingCallback");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitInsn(ACONST_NULL);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/finder/BundleAnnotationFinder$AnnotationFindingCallback", "<init>", "(Lorg/apache/xbean/finder/BundleAnnotationFinder;Lorg/apache/xbean/finder/BundleAnnotationFinder$1;)V", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/osgi/bundle/util/BundleResourceFinder", "find", "(Lorg/apache/xbean/osgi/bundle/util/BundleResourceFinder$ResourceFinderCallback;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 4);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/finder/BundleAnnotationFinder", "paths", "Ljava/util/Set;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(7, 6);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "getResource", "(Ljava/lang/String;)Ljava/net/URL;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/BundleAnnotationFinder", "bundle", "Lorg/osgi/framework/Bundle;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/Bundle", "getResource", "(Ljava/lang/String;)Ljava/net/URL;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PROTECTED, "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", "(Ljava/lang/String;)Ljava/lang/Class<*>;", new String[] { "java/lang/ClassNotFoundException" });
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/BundleAnnotationFinder", "bundle", "Lorg/osgi/framework/Bundle;");
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "org/osgi/framework/Bundle", "loadClass", "(Ljava/lang/String;)Ljava/lang/Class;", true);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getAnnotatedClassNames", "()Ljava/util/List;", "()Ljava/util/List<Ljava/lang/String;>;", null);
methodVisitor.visitCode();
methodVisitor.visitTypeInsn(NEW, "java/util/ArrayList");
methodVisitor.visitInsn(DUP);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/BundleAnnotationFinder", "originalInfos", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "size", "()I", true);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "(I)V", false);
methodVisitor.visitVarInsn(ASTORE, 1);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/BundleAnnotationFinder", "originalInfos", "Ljava/util/Map;");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "entrySet", "()Ljava/util/Set;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "iterator", "()Ljava/util/Iterator;", true);
methodVisitor.visitVarInsn(ASTORE, 2);
Label label0 = new Label();
methodVisitor.visitLabel(label0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "hasNext", "()Z", true);
Label label1 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Iterator", "next", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/util/Map$Entry");
methodVisitor.visitVarInsn(ASTORE, 3);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/finder/BundleAnnotationFinder", "paths", "Ljava/util/Set;");
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getValue", "()Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "org/apache/xbean/finder/AbstractFinder$ClassInfo");
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/finder/AbstractFinder$ClassInfo", "getPath", "()Ljava/lang/String;", false);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Set", "contains", "(Ljava/lang/Object;)Z", true);
Label label2 = new Label();
methodVisitor.visitJumpInsn(IFEQ, label2);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map$Entry", "getKey", "()Ljava/lang/Object;", true);
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "add", "(Ljava/lang/Object;)Z", true);
methodVisitor.visitInsn(POP);
methodVisitor.visitLabel(label2);
methodVisitor.visitJumpInsn(GOTO, label0);
methodVisitor.visitLabel(label1);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(3, 4);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
