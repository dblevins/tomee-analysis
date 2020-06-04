package asm.org.apache.commons.jcs.jcache.cdi;
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
public class MakeJCacheCDIInterceptorFriendly$HelperBean$2Dump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter classWriter = new ClassWriter(0);
FieldVisitor fieldVisitor;
RecordComponentVisitor recordComponentVisitor;
MethodVisitor methodVisitor;
AnnotationVisitor annotationVisitor0;

classWriter.visit(V1_6, ACC_SUPER, "org/apache/commons/jcs/jcache/cdi/MakeJCacheCDIInterceptorFriendly$HelperBean$2", "Ljakarta/enterprise/util/AnnotationLiteral<Ljakarta/enterprise/inject/Any;>;", "jakarta/enterprise/util/AnnotationLiteral", null);

classWriter.visitOuterClass("org/apache/commons/jcs/jcache/cdi/MakeJCacheCDIInterceptorFriendly$HelperBean", "<init>", "(Ljakarta/enterprise/inject/spi/AnnotatedType;Ljakarta/enterprise/inject/spi/InjectionTarget;Ljava/lang/String;)V");

classWriter.visitInnerClass("org/apache/commons/jcs/jcache/cdi/MakeJCacheCDIInterceptorFriendly$HelperBean", "org/apache/commons/jcs/jcache/cdi/MakeJCacheCDIInterceptorFriendly", "HelperBean", ACC_PUBLIC | ACC_STATIC);

classWriter.visitInnerClass("org/apache/commons/jcs/jcache/cdi/MakeJCacheCDIInterceptorFriendly$HelperBean$2", null, null, 0);

{
fieldVisitor = classWriter.visitField(ACC_FINAL | ACC_SYNTHETIC, "this$0", "Lorg/apache/commons/jcs/jcache/cdi/MakeJCacheCDIInterceptorFriendly$HelperBean;", null, null);
fieldVisitor.visitEnd();
}
{
methodVisitor = classWriter.visitMethod(0, "<init>", "(Lorg/apache/commons/jcs/jcache/cdi/MakeJCacheCDIInterceptorFriendly$HelperBean;)V", null, null);
methodVisitor.visitCode();
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitVarInsn(ALOAD, 1);
methodVisitor.visitFieldInsn(PUTFIELD, "org/apache/commons/jcs/jcache/cdi/MakeJCacheCDIInterceptorFriendly$HelperBean$2", "this$0", "Lorg/apache/commons/jcs/jcache/cdi/MakeJCacheCDIInterceptorFriendly$HelperBean;");
methodVisitor.visitVarInsn(ALOAD, 0);
methodVisitor.visitMethodInsn(INVOKESPECIAL, "jakarta/enterprise/util/AnnotationLiteral", "<init>", "()V", false);
methodVisitor.visitInsn(RETURN);
methodVisitor.visitMaxs(2, 2);
methodVisitor.visitEnd();
}
classWriter.visitEnd();

return classWriter.toByteArray();
}
}
