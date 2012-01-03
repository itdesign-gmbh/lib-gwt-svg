/**********************************************
 * Copyright (C) 2010-2011 Lukas Laag
 * This file is part of lib-gwt-svg.
 * 
 * libgwtsvg is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * libgwtsvg is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with libgwtsvg.  If not, see http://www.gnu.org/licenses/
 **********************************************/
/*
 * Copyright (c) 2004 World Wide Web Consortium,
 *
 * (Massachusetts Institute of Technology, European Research Consortium for
 * Informatics and Mathematics, Keio University). All Rights Reserved. This
 * work is distributed under the W3C(r) Software License [1] in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * [1] http://www.w3.org/Consortium/Legal/2002/copyright-software-20021231
 */

package org.vectomatic.dom.svg;

import org.vectomatic.dom.svg.events.ActivateEvent;
import org.vectomatic.dom.svg.events.ActivateHandler;
import org.vectomatic.dom.svg.events.FocusInEvent;
import org.vectomatic.dom.svg.events.FocusInHandler;
import org.vectomatic.dom.svg.events.FocusOutEvent;
import org.vectomatic.dom.svg.events.FocusOutHandler;
import org.vectomatic.dom.svg.events.HasGraphicalHandlers;
import org.vectomatic.dom.svg.impl.SVGElement;
import org.vectomatic.dom.svg.impl.SVGRectElement;
import org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired;
import org.vectomatic.dom.svg.itf.ISVGGraphicsElement;
import org.vectomatic.dom.svg.itf.ISVGLangSpace;
import org.vectomatic.dom.svg.itf.ISVGStylable;
import org.vectomatic.dom.svg.itf.ISVGTests;
import org.vectomatic.dom.svg.itf.ISVGTransformable;
import org.vectomatic.dom.svg.utils.DOMHelper;
import org.vectomatic.dom.svg.utils.SVGConstants;

import com.google.gwt.core.client.JavaScriptException;
import com.google.gwt.dom.client.TagName;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.LoadEvent;
import com.google.gwt.event.dom.client.LoadHandler;
import com.google.gwt.event.dom.client.MouseDownEvent;
import com.google.gwt.event.dom.client.MouseDownHandler;
import com.google.gwt.event.dom.client.MouseMoveEvent;
import com.google.gwt.event.dom.client.MouseMoveHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.event.dom.client.TouchCancelEvent;
import com.google.gwt.event.dom.client.TouchCancelHandler;
import com.google.gwt.event.dom.client.TouchEndEvent;
import com.google.gwt.event.dom.client.TouchEndHandler;
import com.google.gwt.event.dom.client.TouchMoveEvent;
import com.google.gwt.event.dom.client.TouchMoveHandler;
import com.google.gwt.event.dom.client.TouchStartEvent;
import com.google.gwt.event.dom.client.TouchStartHandler;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * The {@link org.vectomatic.dom.svg.OMSVGRectElement} interface corresponds
 * to the <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement' title='rect
 * element specification'>rect</a> element.
 */
@TagName("rect")
public class OMSVGRectElement extends OMSVGElement implements HasGraphicalHandlers, ISVGTests, ISVGLangSpace, ISVGExternalResourcesRequired, ISVGStylable, ISVGTransformable, ISVGGraphicsElement {
  public OMSVGRectElement() {
    this((SVGRectElement)DOMHelper.createElementNS(DOMHelper.getCurrentDocument(), SVGConstants.SVG_NAMESPACE_URI, SVGConstants.SVG_RECT_TAG).cast());
  }

  protected OMSVGRectElement(SVGRectElement ot) {
    super(ot);
  }

  // Implementation of the svg::SVGRectElement W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRectElement#getX()}
   * on the given <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
   * title='rect element specification'>rect</a> element.
   */
  public final OMSVGAnimatedLength getX() {
    return ((SVGRectElement)ot).getX();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRectElement#getY()}
   * on the given <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
   * title='rect element specification'>rect</a> element.
   */
  public final OMSVGAnimatedLength getY() {
    return ((SVGRectElement)ot).getY();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRectElement#getWidth()}
   * on the given <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
   * title='rect element specification'>rect</a> element.
   */
  public final OMSVGAnimatedLength getWidth() {
    return ((SVGRectElement)ot).getWidth();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRectElement#getHeight()}
   * on the given <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
   * title='rect element specification'>rect</a> element.
   */
  public final OMSVGAnimatedLength getHeight() {
    return ((SVGRectElement)ot).getHeight();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRectElement#getRx()}
   * on the given <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
   * title='rect element specification'>rect</a> element.
   */
  public final OMSVGAnimatedLength getRx() {
    return ((SVGRectElement)ot).getRx();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.OMSVGRectElement#getRy()}
   * on the given <a href='http://www.w3.org/TR/SVG11/shapes.html#RectElement'
   * title='rect element specification'>rect</a> element.
   */
  public final OMSVGAnimatedLength getRy() {
    return ((SVGRectElement)ot).getRy();
  }

  // Implementation of the svg::SVGExternalResourcesRequired W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * on the given element. Note that the SVG DOM defines the attribute {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * as being of type {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean}, whereas
   * the SVG language definition says that {@link org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * is not animated. Because the SVG language definition states that {@link
   * org.vectomatic.dom.svg.itf.ISVGExternalResourcesRequired#getExternalResourcesRequired()}
   * cannot be animated, the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getAnimVal()}
   * will always be the same as the {@link org.vectomatic.dom.svg.OMSVGAnimatedBoolean#getBaseVal()}.
   */
  public final OMSVGAnimatedBoolean getExternalResourcesRequired() {
    return ((SVGRectElement)ot).getExternalResourcesRequired();
  }

  // Implementation of the svg::SVGLangSpace W3C IDL interface
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   */
  public final String getXmllang() {
    return ((SVGRectElement)ot).getXmllang();
  }
  /**
   * Corresponds to attribute <code>xml:lang</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmllang(java.lang.String value) throws JavaScriptException {
    ((SVGRectElement)ot).setXmllang(value);
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   */
  public final String getXmlspace() {
    return ((SVGRectElement)ot).getXmlspace();
  }
  /**
   * Corresponds to attribute <code>xml:space</code> on the given element.
   * @throws DOMException(NO_MODIFICATION_ALLOWED_ERR) Raised on an   attempt
   * to change the value of a <a href="svgdom.html#ReadOnlyNodes">read only
   * attribute</a>.
   */
  public final void setXmlspace(java.lang.String value) throws JavaScriptException {
    ((SVGRectElement)ot).setXmlspace(value);
  }

  // Implementation of the svg::SVGLocatable W3C IDL interface
  /**
   * The element which established the current viewport. Often, the nearest
   * ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement' title='svg
   * element specification'>svg</a> element. Null if the current element is
   * the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final OMSVGElement getNearestViewportElement() {
    return (OMSVGElement)convert(((SVGRectElement)ot).getNearestViewportElement());
  }
  /**
   * The farthest ancestor <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element. Null if the current
   * element is the outermost <a href='http://www.w3.org/TR/SVG11/struct.html#SVGElement'
   * title='svg element specification'>svg</a> element.
   */
  public final OMSVGElement getFarthestViewportElement() {
    return (OMSVGElement)convert(((SVGRectElement)ot).getFarthestViewportElement());
  }
  /**
   * Returns the tight bounding box in current user space (i.e., after application
   * of the <code>transform</code> attribute, if any) on the geometry of all
   * contained graphics elements, exclusive of stroking, clipping, masking and
   * filter effects). Note that getBBox must return the actual bounding box
   * at the time the method was called, even in case the element has not yet
   * been rendered.
   * @return An {@link org.vectomatic.dom.svg.OMSVGRect} object that defines
   * the bounding box.
   */
  public final OMSVGRect getBBox() {
    return ((SVGRectElement)ot).getBBox();
  }
  /**
   * Returns the transformation matrix from current user units (i.e., after
   * application of the <code>transform</code> attribute, if any) to the viewport
   * coordinate system for the {@link org.vectomatic.dom.svg.itf.ISVGLocatable#getNearestViewportElement()}.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object that defines
   * the CTM.
   */
  public final OMSVGMatrix getCTM() {
    return ((SVGRectElement)ot).getCTM();
  }
  /**
   * Returns the transformation matrix from current user units (i.e., after
   * application of the <code>transform</code> attribute, if any) to the parent
   * user agent's notice of a "pixel". For display devices, ideally this represents
   * a physical screen pixel. For other devices or environments where physical
   * pixel sizes are not known, then an algorithm similar to the CSS2 definition
   * of a "pixel" can be used instead.  Note that null is returned if this element
   * is not hooked into the document tree. This method would have been more
   * aptly named as <code>getClientCTM</code>, but the name <code>getScreenCTM</code>
   * is kept for historical reasons.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object that defines
   * the given   transformation matrix.
   */
  public final OMSVGMatrix getScreenCTM() {
    return ((SVGRectElement)ot).getScreenCTM();
  }
  /**
   * Returns the transformation matrix from the user coordinate system on the
   * current element (after application of the <code>transform</code> attribute,
   * if any) to the user coordinate system on parameter <var>element</var> (after
   * application of its <code>transform</code> attribute, if any).
   * @param element The target element.
   * @return An {@link org.vectomatic.dom.svg.OMSVGMatrix} object that defines
   * the transformation.
   * @throws SVGException(SVG_MATRIX_NOT_INVERTABLE) Raised if the currently
   * defined transformation matrices make it impossible to compute the   given
   * matrix (e.g., because one of the transformations is singular).
   */
  public final OMSVGMatrix getTransformToElement(OMSVGElement element) throws JavaScriptException {
    return ((SVGRectElement)ot).getTransformToElement(((SVGElement)element.ot));
  }

  // Implementation of the svg::SVGTests W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredFeatures()}
   * on the given element.
   */
  public final OMSVGStringList getRequiredFeatures() {
    return ((SVGRectElement)ot).getRequiredFeatures();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getRequiredExtensions()}
   * on the given element.
   */
  public final OMSVGStringList getRequiredExtensions() {
    return ((SVGRectElement)ot).getRequiredExtensions();
  }
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTests#getSystemLanguage()}
   * on the given element.
   */
  public final OMSVGStringList getSystemLanguage() {
    return ((SVGRectElement)ot).getSystemLanguage();
  }
  /**
   * Returns true if the user agent supports the given extension, specified
   * by a URI.
   * @param extension The name of the extension, expressed as a URI.
   * @return True or false, depending on whether the given extension is   supported.
   */
  public final boolean hasExtension(String extension) {
    return ((SVGRectElement)ot).hasExtension(extension);
  }

  // Implementation of the svg::SVGTransformable W3C IDL interface
  /**
   * Corresponds to attribute {@link org.vectomatic.dom.svg.itf.ISVGTransformable#getTransform()}
   * on the given element.
   */
  public final OMSVGAnimatedTransformList getTransform() {
    return ((SVGRectElement)ot).getTransform();
  }

  @Override
  public final HandlerRegistration addClickHandler(ClickHandler handler) {
    return addDomHandler(handler, ClickEvent.getType());
  }
  @Override
  public final HandlerRegistration addLoadHandler(LoadHandler handler) {
    return addDomHandler(handler, LoadEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseDownHandler(MouseDownHandler handler) {
    return addDomHandler(handler, MouseDownEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseMoveHandler(MouseMoveHandler handler) {
    return addDomHandler(handler, MouseMoveEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseOutHandler(MouseOutHandler handler) {
    return addDomHandler(handler, MouseOutEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseOverHandler(MouseOverHandler handler) {
    return addDomHandler(handler, MouseOverEvent.getType());
  }
  @Override
  public final HandlerRegistration addMouseUpHandler(MouseUpHandler handler) {
    return addDomHandler(handler, MouseUpEvent.getType());
  }
  @Override
  public final HandlerRegistration addTouchCancelHandler(TouchCancelHandler handler) {
    return addDomHandler(handler, TouchCancelEvent.getType());
  }
  @Override
  public final HandlerRegistration addTouchEndHandler(TouchEndHandler handler) {
    return addDomHandler(handler, TouchEndEvent.getType());
  }
  @Override
  public final HandlerRegistration addTouchMoveHandler(TouchMoveHandler handler) {
    return addDomHandler(handler, TouchMoveEvent.getType());
  }
  @Override
  public final HandlerRegistration addTouchStartHandler(TouchStartHandler handler) {
    return addDomHandler(handler, TouchStartEvent.getType());
  }
  @Override
  public final HandlerRegistration addActivateHandler(ActivateHandler handler) {
    return addDomHandler(handler, ActivateEvent.getType());
  }
  @Override
  public final HandlerRegistration addFocusInHandler(FocusInHandler handler) {
    return addDomHandler(handler, FocusInEvent.getType());
  }
  @Override
  public final HandlerRegistration addFocusOutHandler(FocusOutHandler handler) {
    return addDomHandler(handler, FocusOutEvent.getType());
  }
  // Helper methods
  /**
   * Constructor
   * @param x the X coordinate of the upper left corner
   * @param y the Y coordinate of the upper left corner
   * @param width the width of the rectangle
   * @param height the width of the rectangle
   * @param rx the X-axis radius of the rectangle corner
   * @param ry the Y-axis radius of the rectangle corner
   */
  public OMSVGRectElement(float x, float y, float width, float height, float rx, float ry) {
    this();
	getX().getBaseVal().setValue(x);
	getY().getBaseVal().setValue(y);
	getWidth().getBaseVal().setValue(width);
	getHeight().getBaseVal().setValue(height);
	if (rx != 0f) {
		getRx().getBaseVal().setValue(rx);
	}
	if (ry != 0f) {
		getRy().getBaseVal().setValue(ry);
	}
  }
  /**
   * Constructor
   * @param rect The SVG rect to use to initialize this rect.
   */
  public OMSVGRectElement(OMSVGRect rect) {
    this(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight(), 0, 0);
  }
}
