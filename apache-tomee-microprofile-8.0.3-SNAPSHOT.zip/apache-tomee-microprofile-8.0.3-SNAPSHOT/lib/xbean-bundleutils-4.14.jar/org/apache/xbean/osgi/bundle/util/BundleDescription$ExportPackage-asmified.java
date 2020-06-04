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
public class BundleDescription$ExportPackageDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_5, ACC_PUBLIC | ACC_SUPER, "org/apache/xbean/osgi/bundle/util/BundleDescription$ExportPackage", null, "org/apache/xbean/osgi/bundle/util/BundleDescription$HeaderEntry", null);

classWriter.visitInnerClass("org/apache/xbean/osgi/bundle/util/BundleDescription$ExportPackage", "org/apache/xbean/osgi/bundle/util/BundleDescription", "ExportPackage", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/xbean/osgi/bundle/util/BundleDescription$HeaderEntry", "org/apache/xbean/osgi/bundle/util/BundleDescription", "HeaderEntry", ACC_PUBLIC | ACC_STATIC);

{
fieldVisitor = classWriter.visitField(ACC_PRIVATE, "version", "Lorg/osgi/framework/Version;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;)V", null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitVarInsn(ALOAD, 3);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "org/apache/xbean/osgi/bundle/util/BundleDescription$HeaderEntry", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", false);
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 2);
methodVisitor.visitLdcInsn("version");
methodVisitor.visitMethodInsn(INVOKEINTERFACE, "java/util/Map", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", true);
methodVisitor.visitTypeInsn(CHECKCAST, "java/lang/String");
methodVisitor.visitMethodInsn(INVOKESTATIC, "org/apache/xbean/osgi/bundle/util/BundleDescription", "access$000", "(Ljava/lang/String;)Lorg/apache/xbean/osgi/bundle/util/VersionRange;", false);
methodVisitor.visitMethodInsn(INVOKEVIRTUAL, "org/apache/xbean/osgi/bundle/util/VersionRange", "getLow", "()Lorg/osgi/framework/Version;", false);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/xbean/osgi/bundle/util/BundleDescription$ExportPackage", "version", "Lorg/osgi/framework/Version;");
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(4, 4);
methodVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(ACC_PUBLIC, "getVersion", "()Lorg/osgi/framework/Version;", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitFieldInsn(GETFIELD, "org/apache/xbean/osgi/bundle/util/BundleDescription$ExportPackage", "version", "Lorg/osgi/framework/Version;");
methodVisitor.visitInsn(ARETURN);
methodVisitor.visitMaxs(1, 1);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
